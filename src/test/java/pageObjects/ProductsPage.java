package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage	
{
	public ProductsPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Products link visibility
	@FindBy(xpath="//a[@href='/products']")
	WebElement productsLink;
	
	public boolean productsLinkIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(productsLink));
		return productsLink.isDisplayed();
	}
	
	//Products link click action
	public void clickProductsLink()
	{
		wait.until(ExpectedConditions.elementToBeClickable(productsLink));
		productsLink.click();
	}
	
	//All products text visibility
	@FindBy(xpath="//h2[normalize-space()='All Products']")
	WebElement txtAllProducts;
	
	public boolean allProductsTextIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(txtAllProducts));
		return txtAllProducts.isDisplayed();
	}
	
	//Search for a product
	@FindBy(xpath="//input[@id='search_product']")
	WebElement searchProductBox;	
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement btnSearch;
	
	public void SearchProduct(String productName)
	{
		searchProductBox.sendKeys(productName);
		btnSearch.click();
	}
	
	//Verify searched products section
	@FindBy(xpath="//h2[normalize-space()='Searched Products']")
	WebElement txtSearchedProduct;
	
	public boolean isSearchedProductVisible()
	{
		return txtSearchedProduct.isDisplayed();
	}
	
	//Verify search results contains user searched keyword
	@FindBy(xpath="//div[(@class='productinfo text-center')]/p")
	List<WebElement> searchedProductNames;	 
	
	public boolean verifySearchResults(String keyword)
	{
		for(WebElement product:searchedProductNames)
		{
			if(product.getText().toLowerCase().contains(keyword.toLowerCase()))
			{
				return true;
			}
		}
		return false;
	}
	
	//Click view product of first searched item
	@FindBy(xpath="//a[normalize-space()='View Product']")
	List<WebElement> viewProductLinks;
	
	public void clickFirstViewProduct()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(viewProductLinks));
		viewProductLinks.get(0).click();
	}
	

}
