package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountInformationPage;
import pageObjects.SignUpOrLoginPage;
import testBase.BaseClass;

public class TC_01_RegisterUserTest extends BaseClass
{
	@Test
	public void verifyUserRegistration()
	{
		// Initialize page objects
		SignUpOrLoginPage sp=new SignUpOrLoginPage(driver);
		AccountInformationPage aip = new AccountInformationPage(driver);

        // Test data
        String name = "Kevin";
        String email="kevin01QA@yopmail.com";
       //String email = "testuser" + (System.currentTimeMillis() % 10000) + "@mail.com"; //generate random emails
        String password = "Test@123";

		//Step-1 Click on signup/login link
		sp.clickSignupLink();
		Assert.assertTrue(sp.isSignupTextDisplayed(),"Signup/login header is not displayed");
		
		//Step-2 Enter name,email and signup
		sp.signupWith(name, email);
		Assert.assertTrue(sp.isAccountInfoTextDisplayed(),"Account information page not displayed");
		
		//Step-3 Fill account information
		aip.fillAccountInformation(password, "9","May","2000", "Kevin","User", 
		"Test Company", "Toronto Street", "Canada", "Ontario", "Toronto", "123456", "9999911111");
		
		//Step-4 Click on create account button
		aip.clickCreateAccount();
		Assert.assertTrue(aip.isAccountCreatedDisplayed(), "Account Creation Failed");
		
		//Step-5 Continue and verify logged in user
		aip.clickContinue();
		//Assert.assertEquals(hp.getLoggedInUserText(),"Logged in user name is incorrect");
	}
}

