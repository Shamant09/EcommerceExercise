package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpOrLoginPage extends BasePage
{
	public SignUpOrLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Signup link
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement lnkSignup;
	
	public void clickSignupLink()
	{
		wait.until(ExpectedConditions.elementToBeClickable(lnkSignup));
		lnkSignup.click();
	}
	
	//Signup section
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	WebElement txtSignup;
	
	public boolean isSignupTextDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(txtSignup));
		return txtSignup.isDisplayed();
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement btnSignup;
	
	 public void signupWith(String name, String email) 
	 {
	     wait.until(ExpectedConditions.visibilityOf(txtName)).sendKeys(name);
	     txtEmail.sendKeys(email);
	     btnSignup.click();
	 }
	
	//Account info
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	WebElement txtAccount;
	
	public boolean isAccountInfoTextDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(txtAccount));
		return txtAccount.isDisplayed();
	}
	
	//Login section
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	WebElement loginHeader;
	
	public boolean isLoginHeaderDisplayed() 
	{
        wait.until(ExpectedConditions.visibilityOf(loginHeader));
        return loginHeader.isDisplayed();
    }
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement txtloginEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtLpwd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	 public void loginWith(String email, String password) 
	 {
	     wait.until(ExpectedConditions.visibilityOf(txtloginEmail)).sendKeys(email);
	     txtLpwd.sendKeys(password);
	     btnLogin.click();
	 }
	 
	 //For invalid cred's error message
	 @FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']")
	 WebElement txtLoginError;
	 
	 public boolean isLoginErrorDisplayed()
	 {
		 return wait.until(ExpectedConditions.visibilityOf(txtLoginError)).isDisplayed();
	 }
	}
