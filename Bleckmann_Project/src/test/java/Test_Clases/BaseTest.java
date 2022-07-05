package Test_Clases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Page_Clases.PC_01_OM1_ReturnOrder_Page;
import Page_Clases.PC_01_OM2_ReturnOrder_Page;
import Page_Clases.PC_02_OM1_Carrier_Page;
import Page_Clases.PC_02_OM2_ReturnItem_Page;
import Page_Clases.PC_03_OM2_Carrier_Page;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	public static WebDriver driver;
	
	public PC_01_OM1_ReturnOrder_Page OM1_1;
	public PC_02_OM1_Carrier_Page     OM1_2;

	
	public PC_01_OM2_ReturnOrder_Page OM2_1;
	public PC_02_OM2_ReturnItem_Page  OM2_2;
	public PC_03_OM2_Carrier_Page     OM2_3;
	

	public static Logger log;
	
	
	@BeforeSuite
	public void intiDriver() throws IOException
	{
		
		 log = Logger.getLogger("e-commerse");
			PropertyConfigurator.configure("log4j.properties");
			
		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");

		//options.addArguments("enable-automation");
		//options.addArguments("--headless");
		//options.addArguments("--no-sandbox");
		//options.addArguments("--disable-dev-shm-usage");
		//options.addArguments("--diable-browser-sid-navigaion");
		//options.addArguments("--disable-gpu");

		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		log.info("lanch browser");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String url = prop.getProperty("testsiteurl");
	    

		driver.get(url);
		
	}
	
	@BeforeClass
	public void creteobject() throws IOException 
	{
		OM1_1 = new PC_01_OM1_ReturnOrder_Page (driver);
		OM1_2 = new PC_02_OM1_Carrier_Page(driver);
		
		OM2_1 = new PC_01_OM2_ReturnOrder_Page(driver);
		OM2_2 = new PC_02_OM2_ReturnItem_Page(driver);
		OM2_3 = new PC_03_OM2_Carrier_Page(driver);

	}
}
