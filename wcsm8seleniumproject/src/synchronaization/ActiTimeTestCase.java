package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestCase {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://desktop-aigvo6j/login.do");
		 
		
		 if(driver.getTitle().equals("actiTIME - Login"))
		 {
			 System.out.println("Login page Title is Matched !!,Test Case Passed!!");
			 
			 driver.findElement(By.name("username")).sendKeys("admin");
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 driver.findElement(By.id("loginButton")).click();
		 }
		 
		 else
		 {
			 System.out.println("Login page Title is not Matched !!,Test Case Failed!!");
		 }
		 
		 
		 if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
		 {
			 System.out.println("Home page Title is Matched !!,Test Case Passed!!");
		 }
		 
		 else
		 {
			 System.out.println("Home page Title is not Matched !!,Test Case Failed!!");
		 }
		 
		 
		 
		 
		 
	}

}
