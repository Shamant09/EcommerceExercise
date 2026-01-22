package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage 
{
	public CartPage(WebDriver driver)
	{
		super(driver);
	}
	
	//View cart link
	@FindBy(xpath="//u[normalize-space()='View Cart']")
	WebElement lnkViewCart;
	
	public void clickOnViewCart()
	{
		lnkViewCart.click();
	}
	
	//Number of products in cart page
	@FindBy(xpath="//tr[contains(@id,'product')]")
	List<WebElement> cartItems;
	
	public int getCartItemsCount()
	{
		return cartItems.size();
	}
	
	//Remove product from cart page
	@FindBy(xpath="//div//tr//td[@class='cart_delete']//a[@data-product-id='2']")
	WebElement btnRemoveProduct;
	
	public void removeProduct()
	{
		btnRemoveProduct.click();
	}
	
	//Product prices
	@FindBy(xpath="//div//tr//td[@class='cart_price']//p")
	List<WebElement> productPrices;
	
	 @FindBy(xpath = "//td[@class='cart_total']/p")
	 List<WebElement> productTotals;
	 
	 @FindBy(xpath = "//td[@class='cart_quantity']/button")
	 List<WebElement> productQuantities;

	
	public int getTotalCartAmount()
	{
		int total = 0;
        for (WebElement amount : productTotals) 
        {
            total += Integer.parseInt(amount.getText().replace("Rs.", "").trim());
        }
        return total;
	} 
	
	//proceed to checkout
	@FindBy(xpath="//a[normalize-space()='Proceed To Checkout']")
	WebElement btnProceedToCheckout;
	
	public void clickProceedToCheckout()
	{
		btnProceedToCheckout.click();
	}
}
