package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;
@Listeners(CustomeListener.class)

public class TestUserCreated extends BaseTest{
	
	@Test
	public void user1() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH,"password"));
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.clickOnusers();
		
		UserPage up = new UserPage(driver);
		up.userCreate();
		String usn = flib.readExcelData(EXCEL_PATH, "Sheet2",1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "Sheet2",1, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "Sheet2",1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "Sheet2",1, 3);
		
		
		up.firstUser(usn, pass, fn, ln);
		up.delete();
		
		Thread.sleep(2000);
		up.userCreate();
		String usn1 = flib.readExcelData(EXCEL_PATH, "Sheet2",2, 0);
		String pass1 = flib.readExcelData(EXCEL_PATH, "Sheet2",2, 1);
		String fn1 = flib.readExcelData(EXCEL_PATH, "Sheet2",2, 2);
		String ln1 = flib.readExcelData(EXCEL_PATH, "Sheet2",2, 3);
		
		
		up.firstUser(usn1, pass1, fn1, ln1);
		
		up.delete();
		
	}

}
