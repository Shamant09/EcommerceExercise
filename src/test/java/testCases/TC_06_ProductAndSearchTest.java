package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductsPage;
import testBase.BaseClass;

public class TC_06_ProductAndSearchTest extends BaseClass
{
	@Test
	public void verifyProductsAndSearch()
	{
		//Initialize page objects
		ProductsPage pp=new ProductsPage(driver);
			
		//verifying products link is displayed
		Assert.assertTrue(pp.productsLinkIsDisplayed(),"Products link is not displayed");
		
		//Click on products link
		pp.clickProductsLink();
		
		//Verify product list is displayed
		Assert.assertTrue(pp.allProductsTextIsDisplayed(),"Prodcuts list is not displayed");
		
		//Search product
		String productName="Tshirt";
		//String productName2="Soft Stretch Jeans";
		pp.SearchProduct(productName);
		
		//verify search results section
		Assert.assertTrue(pp.isSearchedProductVisible(),"Searched Products section not visible");
		
		//Verify searched products are relevant
		Assert.assertTrue(pp.verifySearchResults(productName), "Search Results do not match with searched keyword");
	}
}
