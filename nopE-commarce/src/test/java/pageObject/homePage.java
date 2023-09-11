package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObject.homePage;
import testCases.baseClass;

public class homePage extends baseClass {
	
	public homePage(){
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logIn;
	
	public void logIN()
	{
		logIn.click();
	}

}
