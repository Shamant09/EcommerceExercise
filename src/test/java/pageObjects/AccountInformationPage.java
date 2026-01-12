package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage extends BasePage
{
	public AccountInformationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement genderRadio;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement days;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement months;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement years;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement newsletter;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement offers;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement mobile;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement createAccountBtn;
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement accountCreatedMsg;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continueBtn;
	
	public void fillAccountInformation(String pwd,String day,String month,String year,
			String fName,String lName,String companyName,String addr,String countryName,
            String stateName,String cityName,String zip,String mobileNo)
	{

        wait.until(ExpectedConditions.elementToBeClickable(genderRadio)).click();
        password.sendKeys(pwd);

        Select daySelect = new Select(days);
        daySelect.selectByValue(day);

        Select monthSelect = new Select(months);
        monthSelect.selectByVisibleText(month);

        Select yearSelect = new Select(years);
        yearSelect.selectByValue(year);

        newsletter.click();
        offers.click();

        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        company.sendKeys(companyName);
        address.sendKeys(addr);

        Select countryNameSelect = new Select(country);
        countryNameSelect.selectByVisibleText(countryName);

        state.sendKeys(stateName);
        city.sendKeys(cityName);
        zipcode.sendKeys(zip);
        mobile.sendKeys(mobileNo);
    }

    public void clickCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn)).click();
    }

    public boolean isAccountCreatedDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(accountCreatedMsg));
        return accountCreatedMsg.isDisplayed();
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
}

