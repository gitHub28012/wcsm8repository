package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[.='Logout']") private WebElement LogoutLink;
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']") private WebElement enterTimeTrackDropDown;
	@FindBy(xpath = "//input[@id='SubmitTTButton']") private WebElement saveLeaveButton;
	@FindBy(xpath = "//div[.='Users']/following-sibling::img") private WebElement usersTab;
	
	
	
	//initialization
	public HomePage(WebDriver driver) 
	{
	   PageFactory.initElements(driver,this);
	}


	
	//utilization

	public WebElement getLogoutLink() {
		return LogoutLink;
	}



	public WebElement getEnterTimeTrackDropDown() {
		return enterTimeTrackDropDown;
	}



	public WebElement getSaveLeaveButton() {
		return saveLeaveButton;
	}



	public WebElement getUsersTab() {
		return usersTab;
	}
	
	// operational methods
	
	
	public void logOut()
	{
		LogoutLink.click();
	}
	
	public void clickOnusers()
	{
		if(usersTab.isDisplayed())
		{
			usersTab.click();
		}
		else
		{
			System.out.println("we got the exception!!!");
		}
		
	}
	


}
