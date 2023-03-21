package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//To avoid IllegalStatException
	//	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		// to launch Firefox Browser
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
	}

}
