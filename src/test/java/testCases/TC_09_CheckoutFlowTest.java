package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductsPage;
import pageObjects.SignUpOrLoginPage;
import testBase.BaseClass;

public class TC_09_CheckoutFlowTest extends BaseClass
{
	@Test 
	public void checkoutProcess()
	{
		//initialize page objects
		CartPage cp=new CartPage(driver);
		ProductsPage pp=new ProductsPage(driver);
		SignUpOrLoginPage sp=new SignUpOrLoginPage(driver);
		CheckoutPage ckp=new CheckoutPage(driver);
		HomePage hp=new HomePage(driver);
		
		//Test data(already registered user)
		String email="kevin01QA@yopmail.com";
		String password="Test@123";
		
		//login to account(without login we can't complete chekout process)
		sp.clickSignupLink();
		sp.loginWith(email, password);
		
		//clicking on products link
		pp.clickProductsLink();
		
		//Adding products to cart
		pp.addFirstProductToCart();
		pp.addSecondProductToCart();
		
		//clicking on view cart link
		cp.clickOnViewCart();
		
		//clicking on proceed to checkout button
		ckp.clickProceedToCheckout();
		
		//click on place order button
		ckp.clickPlaceOrderButton();
		
		//Enter card details and confirm order
		String cardname="Kevin";
		String cardnumber="1111122222";
		String cvcnumber="123";
		String expirationmonth="10";
		String expirationyear="2030";
		
		ckp.addCardName(cardname);
		ckp.addCardNumber(cardnumber);
		ckp.addCvc(cvcnumber);
		ckp.addExpirationMonth(expirationmonth);
		ckp.addExpirationYear(expirationyear);
		ckp.clickPayAndConfirmOrder();
		
		//validate order successfully placed
		Assert.assertTrue(ckp.orderSuccessMessage(), "Order is not successfull");
		ckp.clickOnContinueButton();
		
		//logout
		hp.clickOnLogout();
	}
}
