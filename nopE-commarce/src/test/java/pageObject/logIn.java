package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.baseClass;

public class logIn extends baseClass{
	
	public logIn(){
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement lo;
	
	@FindBy(xpath = "//*[@id=\"RememberMe\"]")
	WebElement tick;
	
	public void login(String log)
	{
		email.sendKeys(log);
		
		
	}
	public void pass(String pa)
	{
		password.sendKeys(pa);
		
	}
	public void log()
	{
		lo.click();
		
	}
	
	public void t() {
		// TODO Auto-generated method stub
		tick.click();;
	}
}
