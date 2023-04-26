package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex1 {
	// 	Multi Select DropDown...

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsm8/multiSelectDrpdown.html");

		 WebElement dropDown = driver.findElement(By.id("i1"));
		 
		 Select sel = new Select(dropDown);
		 // select single option from multi select dropdown.
		 
		      sel.selectByIndex(8);
		 
		 // select multiple options from multi select dropdown..
		 
		 for(int i=0;i<=6;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(2000);
		 }


	}

}
