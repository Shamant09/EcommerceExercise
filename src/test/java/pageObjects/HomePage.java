package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//For homepage visibilty by logo
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	WebElement logo;
	
	public boolean isLogoDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(logo));
		return logo.isDisplayed();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Logged in as ')]")
    WebElement loggedInUser;
	
	 public String getLoggedInUserText() 
	 {
	    wait.until(ExpectedConditions.visibilityOf(loggedInUser));
	    return loggedInUser.getText();
     }

	//For delete account flow
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement lnkDelete;
	
	public void clickDeleteAccountLink()
	{
		wait.until(ExpectedConditions.elementToBeClickable(lnkDelete));
		lnkDelete.click();
	}
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement txtDeleteAccount;
	
	public boolean ConfirmDeleteAccount()
	{
		wait.until(ExpectedConditions.visibilityOf(txtDeleteAccount));
		return txtDeleteAccount.isDisplayed();
	}
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btndeleteContinue;
	
	public void clickContinueDeleteScreen()
	{
		wait.until(ExpectedConditions.elementToBeClickable(btndeleteContinue));
		btndeleteContinue.click();
	}
	
	//For logout flow
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutLink;
	
	public void clickOnLogout()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		logoutLink.click();
	}
	
}
