package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage 
{
	public ProductDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	//product name
	@FindBy(xpath="//div[@class='product-information']/h2")
	WebElement productName;
	
	public boolean isProductNameDisplayed()
	{
		return productName.isDisplayed();
	}
	
	//category name
	@FindBy(xpath="//div[@class='product-information']/p[1]")
	WebElement category;
	
	public boolean isProductCategoryDisplayed()
	{
		return category.isDisplayed();
	}
	
	//reviews
	@FindBy(xpath="//div[@class='product-information']/img")
	WebElement reviewes;
	
	public boolean isProductReviewDisplayed()
	{
		return reviewes.isDisplayed();
	}
	
	//product price
	@FindBy(xpath="//span[contains(text(),'Rs.')]")
	WebElement price;
	
	public boolean isProductPriceDisplayed()
	{
		return price.isDisplayed();
	}
	
	//availability of product
	@FindBy(xpath="//b[normalize-space()='Availability:']")
	WebElement availabilityLabel;
	
	public boolean isProductAvailabilityDisplayed()
	{
		return availabilityLabel.isDisplayed();
	}

	//condition of the product
	@FindBy(xpath="//b[normalize-space()='Condition:']")
	WebElement conditionLable;
	
	public boolean isProductConditionDisplayed()
	{
		return conditionLable.isDisplayed();
	}
	
	//Brand of the product
	@FindBy(xpath="//b[normalize-space()='Brand:']")
	WebElement brandLable;
	
	public boolean isProductBrandDisplayed()
	{
		return brandLable.isDisplayed();
	}
}
