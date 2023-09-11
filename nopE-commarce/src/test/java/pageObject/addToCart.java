package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.baseClass;

public class addToCart extends baseClass{
	
	public addToCart()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
	WebElement addTo;
	
	
	
	@FindBy(xpath ="//*[@id=\"bar-notification\"]/div/span")
	WebElement cancel;
	
	@FindBy(xpath  = "//*[@id=\"topcartlink\"]/a")
	WebElement ShoppingCart;
	
	public void mouseOverr()
	{
		Actions action = new Actions(driver);
		action.moveToElement(ShoppingCart).perform();
	}

	
	public void add()
	{
		addTo.click();
		cancel.click();
	}
	
	
	
}
