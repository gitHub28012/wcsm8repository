package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	
	// it is use to verify dropDown type!!
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsm8/multiSelectDrpdown.html");
	    
	    WebElement dropDown = driver.findElement(By.name("menu"));
	    
	    Select sel = new Select(dropDown);
	    boolean verify = sel.isMultiple();
	    System.out.println(verify);
	    
	}

}
