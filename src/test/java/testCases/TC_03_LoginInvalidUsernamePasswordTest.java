package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SignUpOrLoginPage;
import testBase.BaseClass;

public class TC_03_LoginInvalidUsernamePasswordTest extends BaseClass 
{
	@Test
	public void LoginByInvalidInputs()
	{
		// Initialize page objects
		SignUpOrLoginPage sp=new SignUpOrLoginPage(driver);
		
		//invalid test data
		String invalidEmail="invalidEmail@yopmail.com";
		String invalidPassword="invalid123";
		
		//Step 1 navigate to login page
		sp.clickSignupLink();
		
		//Step 2 enter invaild details
		sp.loginWith(invalidEmail, invalidPassword);
		
		//Step 3 verify error message
		Assert.assertTrue(sp.isLoginErrorDisplayed(),"Error message not displayed for invalid login");
	}
}
