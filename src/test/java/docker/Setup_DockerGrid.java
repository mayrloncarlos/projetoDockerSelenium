package docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {
	
	@BeforeTest
	public void startDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(15000);
	}
	
	@AfterTest
	public void stopDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

}
