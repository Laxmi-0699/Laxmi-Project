package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.baseClass;

public class search extends baseClass {
	
	public search()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//*[@id=\"small-searchterms\"]")
	WebElement searchText;
	
	@FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
	WebElement searchClick;
	
	public void searchT(String book)
	{
		searchText.sendKeys(book);
		searchClick.click();
	}
	
	

}
