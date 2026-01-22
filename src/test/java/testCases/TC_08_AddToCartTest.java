package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class TC_08_AddToCartTest extends BaseClass
{
	@Test
	public void addProductToCartTest()
	{
		//initialize page objects
		ProductsPage pp=new ProductsPage(driver);
		CartPage cp=new CartPage(driver);
		
		//click on products link
		pp.clickProductsLink();
		
		//Add product to cart
		pp.addFirstProductToCart();
		Assert.assertEquals(cp.getCartItemsCount(),1);
		
		//Add multiple products
		pp.addFirstProductToCart();
		pp.addSecondProductToCart();
		Assert.assertEquals(cp.getCartItemsCount(),2);
		
		//Remove products from cart
		pp.addFirstProductToCart();
		cp.removeProduct();
		Assert.assertEquals(cp.getCartItemsCount(),0);
		
		//Verify cart price calculation
		pp.addFirstProductToCart();
		pp.addSecondProductToCart();
		
		int calculatedTotal=cp.getTotalCartAmount();
		Assert.assertTrue(calculatedTotal > 0);
	}

}
