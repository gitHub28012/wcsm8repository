package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {
	
	// by using text() function
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sneakers")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//h3[contains(text(),'Puma Punch')]/descendant::span[text()='Puma White-Puma White']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
