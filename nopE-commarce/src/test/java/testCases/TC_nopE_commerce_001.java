package testCases;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObject.logIn;
import pageObject.homePage;
import pageObject.register;
import pageObject.search;
import pageObject.addToCart;
import pageObject.ScrollUp;

public class TC_nopE_commerce_001 extends baseClass {
	
	logIn logIn;
	homePage homePage;
	register register;
	search search;
	addToCart addToCart;
	ScrollUp ScrollUp;
	
	
	
	
	public TC_nopE_commerce_001()
	{
		super();
	}
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		initialization();
		logIn = new logIn();
		homePage = new homePage();
		register = new register();
		search = new search();
		addToCart= new addToCart();
		ScrollUp = new ScrollUp();
		
	}
	
	@Test
	public void register()
	{
		SoftAssert softAssert=new SoftAssert();
		register.register1();
		register.name("Dipali");
		register.lname("Bari");
		register.Dob();
		register.email("dipalibari333@gmail.com");
		register.companyName("congnizant");
		register.pass("Dipu@123");
		register.comP("Dipu@123");
	
		
		softAssert.assertAll();
	}
	
	@Test
	public void logIn()
	{
		SoftAssert softAssert=new SoftAssert();
		homePage.logIN();
		softAssert.assertAll();
	}
	
	
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		SoftAssert softAssert=new SoftAssert();
		
		homePage.logIN();
		logIn.login("dipalibari333@gmail.com");
		logIn.pass("Dipu@123");
		Thread.sleep(2000);
		logIn.t();
		logIn.log();
		
		softAssert.assertAll();
	}
	
	@Test
	public void search() throws InterruptedException
	{
		SoftAssert softAssert=new SoftAssert();
		homePage.logIN();
		logIn.login("dipalibari333@gmail.com");
		logIn.pass("Dipu@123");
		Thread.sleep(2000);
		logIn.t();
		logIn.log();
		search.searchT("laptop");
		softAssert.assertAll();
	}
	
	@Test
	public void addToC() throws InterruptedException
	{
		SoftAssert softAssert=new SoftAssert();
		homePage.logIN();
		logIn.login("dipalibari333@gmail.com");
		logIn.pass("Dipu@123");
		Thread.sleep(2000);
		logIn.t();
		logIn.log();
		search.searchT("laptop");
		Thread.sleep(3000);
		addToCart.add();
		addToCart.mouseOverr();
		Thread.sleep(3000);
		softAssert.assertAll();
	}
	@Test
	public void scroll() throws InterruptedException
	{
		
		SoftAssert softAssert=new SoftAssert();
		homePage.logIN();
		logIn.login("dipalibari333@gmail.com");
		logIn.pass("Dipu@123");
		Thread.sleep(2000);
		logIn.t();
		logIn.log();
		search.searchT("laptop");
		Thread.sleep(3000);
		addToCart.add();
		ScrollUp.scrollup();
		Thread.sleep(3000);
		softAssert.assertAll();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	    driver.close();
	}
	
}
