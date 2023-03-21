package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		

		//to avoid IllegalStatException.
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// To avoid ConnectionFailedException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// to launch chrome Browser
		ChromeDriver driver = new ChromeDriver(co);
	
		// to maximize browser
		driver.manage().window().maximize();
		
		// to close the chrome Browser
		Thread.sleep(2000); // stop the execution of script for 2 sec.
		
		driver.close();
	}

}
