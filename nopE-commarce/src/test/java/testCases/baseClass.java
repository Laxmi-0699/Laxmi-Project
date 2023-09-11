package testCases;


import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	

	public static WebDriver driver;
	public static Properties prop;
	
	public baseClass()
	{
		try {                                                         
			FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"/properties/config.properties");
			prop=new Properties();
			prop.load(fileInputStream); //load config file
			}
		catch (Exception e) 
		{	
			e.printStackTrace();  
			}
		}
		public void initialization()
		{                              //return value store inside browser
			String browserName = prop.getProperty("browser");
			
			
			if(browserName.equals("chrome"))
			{
				
				System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
			

				driver = new ChromeDriver(options);
			 
			  driver.navigate().to(prop.getProperty("url")); //navigate to move
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.manage().deleteAllCookies();
			  }
	}

}
