package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.baseClass;

public class register extends baseClass{
	
	
	public register(){
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement regi;
	
	@FindBy(xpath = "//*[@id=\"gender-female\"]")
	WebElement female;
	
	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	WebElement FName;
	
	@FindBy(xpath = "//*[@id=\"LastName\"]")
	WebElement LName;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[23]")
	WebElement date;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[7]")
	WebElement month;
	
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[86]")
	WebElement year;
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"Company\"]")
	WebElement comName;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
	WebElement compass;
	
	@FindBy(xpath = "//*[@id=\"Newsletter\"]")
	WebElement news;
	
	@FindBy(xpath ="//*[@id=\"register-button\"]")
	WebElement r;
	
	public void register1()
	{
		regi.click();
		female.click();
		
	}
	
	public void name(String fname )
	{
		FName.sendKeys(fname);
		
	}
	
	public void lname(String lname)
	{
		LName.sendKeys(lname);
	}
	
	public void Dob() {
		
		date.click();
		month.click();
		year.click();
	}
	
	public void email(String e)
	{
		email.sendKeys(e);
	}
	
	public void companyName(String c)
	{
		comName.sendKeys(c);
		news.click();
	}
	
	public void pass(String p)
	{
		pass.sendKeys(p);
	}
	public void comP(String c)
	{
		compass.sendKeys(c);
		r.click();
	}
	
	

}
