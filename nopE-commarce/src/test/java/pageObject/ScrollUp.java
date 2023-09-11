package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import testCases.baseClass;

public class ScrollUp extends baseClass{
	
	public ScrollUp()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void scrollup()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
	}

}
