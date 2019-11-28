package docker;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

	@Test
	public void test4() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();

		assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
		driver.quit();
	}
}
