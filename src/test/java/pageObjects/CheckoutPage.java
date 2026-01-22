package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage
{
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	//proceed to checkout button
	@FindBy(xpath="//a[normalize-space()='Proceed To Checkout']")
	WebElement btnProceedToCheckout;
	
	public void clickProceedToCheckout()
	{
		btnProceedToCheckout.click();
	}
	
	//place order button
	@FindBy(xpath="//a[normalize-space()='Place Order']")
	WebElement btnPlaceOrder;
	
	public void clickPlaceOrderButton() 
	{
		btnPlaceOrder.click();
	}
	
	//name on card field
	@FindBy(xpath="//input[@name='name_on_card']")
	WebElement txtCardName;
	
	public void addCardName(String cardName)
	{
		txtCardName.sendKeys(cardName);
	}
	
	//card number
	@FindBy(xpath="//input[@name='card_number']")
	WebElement txtCardNumber;
	
	public void addCardNumber(String cardNumber) 
	{
		txtCardNumber.sendKeys(cardNumber);
	}
	
	//cvc field
	@FindBy(xpath="//input[@placeholder='ex. 311']")
	WebElement txtCvc;
	
	public void addCvc(String CVC) 
	{
		txtCvc.sendKeys(CVC);
	}
	
	//Expiration month
	@FindBy(xpath="//input[@placeholder='MM']")
	WebElement txtExpMonth;
	
	public void addExpirationMonth(String expMonth)
	{
		txtExpMonth.sendKeys(expMonth);
	}
	
	//Expiration year
	@FindBy(xpath="//input[@placeholder='YYYY']")
	WebElement txtExpYear;
	
	public void addExpirationYear(String ExpYear) 
	{
		txtExpYear.sendKeys(ExpYear);
	}
	
	//pay and confirm order button
	@FindBy(xpath="//button[@id='submit']")
	WebElement btnPayAndConfirmOrder;
	
	public void clickPayAndConfirmOrder()
	{
		btnPayAndConfirmOrder.click();
	}
	
	//order placed success message
	@FindBy(xpath="//b[normalize-space()='Order Placed!']")
	WebElement txtOrderPlaced;
	
	public boolean orderSuccessMessage()
	{
		return txtOrderPlaced.isDisplayed();
	}
	
	//continue button from order placed screen
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public void clickOnContinueButton() 
	{
		btnContinue.click();
	}
	
}
