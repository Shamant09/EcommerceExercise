package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUpOrLoginPage;
import testBase.BaseClass;

public class TC_04_LogoutUserTest extends BaseClass
{
	@Test
	public void verifyLogout()
	{
		// Initialize page objects
		SignUpOrLoginPage sp=new SignUpOrLoginPage(driver);
		HomePage hp=new HomePage(driver);
		
		//Test data(already registered data)
		String email="kevin01QA@yopmail.com";
		String password="Test@123";
		
		//Step 1 click on signup/login link
		sp.clickSignupLink();
		
		//Step 2 Enter email,password and login
		sp.loginWith(email, password);
		
		//Step 3 logout
		hp.clickOnLogout();
	}
}
