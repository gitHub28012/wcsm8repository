package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/index.htm");
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Pune')]")).click();
		driver.findElement(By.xpath("//input[@id='to']")).click();
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Kochi, Cochin International Airport, COK, India, IN");
		//driver.findElement(By.xpath("//a[contains(text(),'Kochi')]")).click();
		driver.findElement(By.xpath("//input[@name='_depdateeu1']")).sendKeys("08/04/2023");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-a')]")).click();
		driver.findElement(By.xpath("//input[@name='_retdateeu1']")).click();
		driver.findElement(By.xpath("//a[text()='10' and (@class='ui-state-default ui-state-active')]")).click();
	    driver.findElement(By.id("btnbooking")).click();
	}

}
