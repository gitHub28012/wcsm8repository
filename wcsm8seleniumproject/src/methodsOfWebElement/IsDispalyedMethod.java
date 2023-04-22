package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDispalyedMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.netflix.com/in/login");
		
		WebElement usnTB = driver.findElement(By.name("userLoginId"));
		WebElement passTB = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		if(usnTB.isDisplayed())
		{
			usnTB.sendKeys("Tanmay@123");
		}
		
		else
		{
			System.out.println("Will get Exception!!");
		}
		
		
		if(passTB.isDisplayed())
		{
			passTB.sendKeys("qwert123");
		}
		
		else
		{
			System.out.println("Will get Exception!!");
		}
		
		if(button.isDisplayed())
		{
			button.click();
		}
		
		else
		{
			System.out.println("Will get Exception!!");
		}
		
		
	}

}
