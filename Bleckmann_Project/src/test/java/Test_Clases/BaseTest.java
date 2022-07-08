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

import PageClass_OM1.PC_01_OM1_ReturnOrder_Page;
import PageClass_OM1.PC_02_OM1_Carrier_Page;
import PageClass_OM2.PC_01_OM2_ReturnOrder_Page;
import PageClass_OM2.PC_02_OM2_ReturnItem_Page;
import PageClass_OM2.PC_03_OM2_Carrier_Page;
import PageClass_OM3.PC_01_OM3_Login_Page;
import PageClass_OM3.PC_02_OM3_Modules_Page;
import PageClass_OM3.PC_03_OM3_Customers_Page;
import PageClass_OM3.PC_04_OM3_Return_Order;
import PageClass_OM3.PC_05_OM3_Carrier_Page;
import PageClass_OM4.PC_01_OM4_ReturnOrder_Page;
import PageClass_OM4.PC_02_OM4_ReturnItems_Page;
import PageClass_OM4.PC_03_OM4_Carrier_Page;
import PageClass_OM6.PC_01_OM6_ReturnOrder_Page;
import PageClass_OM6.PC_02_OM6_Carrier_Page;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	public static WebDriver driver;
	
	public PC_01_OM1_ReturnOrder_Page OM1_1;
	public PC_02_OM1_Carrier_Page     OM1_2;

	public PC_01_OM2_ReturnOrder_Page OM2_1;
	public PC_02_OM2_ReturnItem_Page  OM2_2;
	public PC_03_OM2_Carrier_Page     OM2_3;
	
	public PC_01_OM3_Login_Page       OM3_1;
	public PC_02_OM3_Modules_Page     OM3_2;
	public PC_03_OM3_Customers_Page   OM3_3;
	public PC_04_OM3_Return_Order     OM3_4;
	public PC_05_OM3_Carrier_Page     OM3_5;
	
	public PC_01_OM4_ReturnOrder_Page OM4_1;
	public PC_02_OM4_ReturnItems_Page OM4_2;
	public PC_03_OM4_Carrier_Page     OM4_3;
	
	public PC_01_OM6_ReturnOrder_Page OM6_1;
	public PC_02_OM6_Carrier_Page     OM6_2;

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
		
		String url = prop.getProperty("URL_OM6");
	    

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
		
		OM3_1 = new PC_01_OM3_Login_Page(driver);
		OM3_2 = new PC_02_OM3_Modules_Page(driver);
		OM3_3 = new PC_03_OM3_Customers_Page(driver);
		OM3_4 = new PC_04_OM3_Return_Order(driver);
	    OM3_5 = new PC_05_OM3_Carrier_Page(driver);
	    
	    OM4_1 = new PC_01_OM4_ReturnOrder_Page(driver);
	    OM4_2 = new PC_02_OM4_ReturnItems_Page(driver);
	    OM4_3 = new PC_03_OM4_Carrier_Page(driver);
	    
		OM6_1 = new PC_01_OM6_ReturnOrder_Page(driver);
		OM6_2 = new PC_02_OM6_Carrier_Page(driver);
		

	}
}
