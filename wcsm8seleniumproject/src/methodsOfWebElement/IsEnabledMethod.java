package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		boolean verifyButton = loginButton.isEnabled();
		System.out.println(verifyButton);
		
		driver.findElement(By.name("username")).sendKeys("qwgwhdfgaekga");
		driver.findElement(By.name("password")).sendKeys("adigfidgvidgsu");
		
		boolean verify = loginButton.isEnabled();
		
		System.out.println(verify);
		
		
	}

}
