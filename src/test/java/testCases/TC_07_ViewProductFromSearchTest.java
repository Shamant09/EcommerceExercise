package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductDetailsPage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class TC_07_ViewProductFromSearchTest extends BaseClass
{
	@Test
	public void verifyProductDetailsFromSearchResults()
	{
		//Initialize page objects
		ProductsPage pp=new ProductsPage(driver);
		ProductDetailsPage pdp=new ProductDetailsPage(driver);
		
		//Open products page
		pp.clickProductsLink();
		
		//Search product
		String productname="Tshirt";
		pp.SearchProduct(productname);
		pp.isSearchedProductVisible();
		
		//click on view product for first item
		pp.clickFirstViewProduct();
		
		//validate product details
		Assert.assertTrue(pdp.isProductNameDisplayed(),"Product Name is not displayed");//product name
		Assert.assertTrue(pdp.isProductCategoryDisplayed(), "Product category not displayed"); //product category
		Assert.assertTrue(pdp.isProductReviewDisplayed(), "Product reviewes not displayed"); //product reviewes
		Assert.assertTrue(pdp.isProductPriceDisplayed(),"Product price is not displayed"); //product price
		Assert.assertTrue(pdp.isProductAvailabilityDisplayed(),"Product Availability status not displayed"); //availability of product
		Assert.assertTrue(pdp.isProductConditionDisplayed(), "Product condition status is not displayed"); //condition of product
		Assert.assertTrue(pdp.isProductBrandDisplayed(), "Product brand name is not displayed"); //brand
	}
}
