package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(xpath = "//input[@name='username']") private WebElement usnTB;
	@FindBy(xpath = "//input[@name='pwd']") private WebElement passTB;
	@FindBy(xpath = "//a[@id='loginButton']") private WebElement loginButton;
	@FindBy(xpath = "//input[@name='remember']") private WebElement checkBox;




	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver,this);

	}


	// getter Methods 

	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}




	// operational Methods

	public void validLogin(String validUsn,String validPass)
	{
		usnTB.sendKeys(validUsn);
		passTB.sendKeys(validPass);
		loginButton.click();
	}



	public void invalidLogin(String invalidUsn,String invalidPass) throws InterruptedException
	{
		usnTB.sendKeys(invalidUsn);
		passTB.sendKeys(invalidPass);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();

	}


}
