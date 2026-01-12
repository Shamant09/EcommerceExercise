package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUpOrLoginPage;
import testBase.BaseClass;

public class TC_02_LoginValidUsernamePasswordTest extends BaseClass
{
	@Test
	public void LoginByValidInputs()
	{
		// Initialize page objects
		SignUpOrLoginPage sp=new SignUpOrLoginPage(driver);
		HomePage hp=new HomePage(driver);
		
		//Test data(already registered user)
		String email="kevin01QA@yopmail.com";
		String password="Test@123";
		
		//Step 1 click on signup or login link
		sp.clickSignupLink();
		
		//Step 2 enter valid email and password
		sp.loginWith(email, password);
		
		//Step 3 Logout 
		hp.clickOnLogout();
	}
}
