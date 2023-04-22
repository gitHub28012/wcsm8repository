package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-aigvo6j/login.do");

		WebElement checkBox = driver.findElement(By.name("remember"));
		
		boolean verify = checkBox.isSelected();
		
		System.out.println(verify);
		
		checkBox.click();
		boolean verfiy1 = checkBox.isSelected();
		System.out.println(verfiy1);
		
		
	}
}