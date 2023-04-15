package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver(eo);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);// 
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0;i<options.size();i++)
		{
			
			String nameOfMobiles = options.get(i).getText();
			
			for(int j=i;j<=i;j++)
			{
				String priceOfMobiles = alloptions.get(j).getText();
				System.out.print(nameOfMobiles+"   :"+priceOfMobiles);
				Thread.sleep(2000);
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
