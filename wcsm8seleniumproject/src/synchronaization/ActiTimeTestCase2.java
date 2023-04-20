package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTestCase2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-aigvo6j/login.do");


		String loginPageTitle = driver.getTitle();
		if(waitMethod(driver, 30, loginPageTitle))
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


	      String homePageTitle = driver.getTitle();

		if(waitMethod(driver,30, homePageTitle))
		{
			System.out.println("Home page Title is Matched !!,Test Case Passed!!");
		}

		else
		{
			System.out.println("Home page Title is not Matched !!,Test Case Failed!!");
		}
	}


	   public static Boolean waitMethod(WebDriver driver,int sec,String title)
	   {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		   Boolean titleOfPage = wait.until(ExpectedConditions.titleContains(title));
		   return titleOfPage;
	   }
	
	
	
	
	
	
	
}
