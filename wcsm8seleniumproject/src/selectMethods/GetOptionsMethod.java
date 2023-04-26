package selectMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	// to get the options from dropDown

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/wcsm8/multiSelectDrpdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);
		
		List<WebElement> allOptions = sel.getOptions();
		
		// to read the list of webelement use looping statments...
		
		// for loop
		for(int i=0;i<allOptions.size();i++)
		{
			String option = allOptions.get(i).getText();
			System.out.println(option);
		}
		
//------------------------------------------------------------------------------------
		//  Advance for loop
		  
//		
//		for(WebElement op:allOptions)
//		{
//			String options = op.getText();
//			System.out.println(options);
//		}
//		
		

	}

}
