package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
	
	// on Single select ....
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsm8/SingleselectDrpdown.html");
	    
	    // How to select the option 
	    
	    WebElement dropDown = driver.findElement(By.name("menu"));
	    
	    Select sel = new Select(dropDown);
	    
	    Thread.sleep(3000);
	    sel.selectByIndex(4);
	    
	    Thread.sleep(3000);
	    sel.deselectByIndex(4);
	    
	    
	    
	}

}
