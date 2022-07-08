package PageClass_OM3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_03_OM3_Customers_Page {
	
WebDriver driver;

	@FindBy(xpath = "//input[@class='search_input']")
	private WebElement Search;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div[59]/div/div[1]/h5/center/a[3]")
	private WebElement OM3;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div[59]/div/div[1]/h5/center/a[1]")
	private WebElement OM1;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div[59]/div/div[1]/h5/center/a[2]")
	private WebElement OM2;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div[59]/div/div[1]/h5/center/a[4]")
	private WebElement OM4;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div[59]/div/div[1]/h5/center/a[5]")
	private WebElement OM6;
	
	@FindBy(xpath = "(//div[@class='icon-holder red'])[1]")
	private WebElement Return1;	
	
	
	public PC_03_OM3_Customers_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void EnterCustomerName() throws InterruptedException {
		Thread.sleep(3000);
		String mainwinid = driver.getWindowHandle();
		Return1.click();

		Set<String> childparentwinid = driver.getWindowHandles();
		childparentwinid.remove(mainwinid);
	    driver.switchTo().window((String)childparentwinid.toArray()[0]);

		
		Search.click();
		Search.sendKeys("test");
		Thread.sleep(3000);
		}
	
	

	public void ClickOM3() throws InterruptedException{
		Thread.sleep(3000);
		OM3.click();
		
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);

		// parent window Id=(0),   child Window ID=(1)
		ArrayList<String> al = new ArrayList<String>(AllIds);  
		 String ChildWindowID = al.get(2);  
		  
		 //Switch to Child Window 
		 driver.switchTo().window(ChildWindowID);
		 
		}

	public void ClickOM1() throws InterruptedException{
		Thread.sleep(3000);
		OM1.click();
		
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);

		// parent window Id=(0),   child Window ID=(1)
		ArrayList<String> al = new ArrayList<String>(AllIds);  
		 String ChildWindowID = al.get(2);  
		  
		 //Switch to Child Window 
		 driver.switchTo().window(ChildWindowID);
		 
		}

	public void ClickOM2() throws InterruptedException{
		Thread.sleep(3000);
		OM2.click();
		
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);

		// parent window Id=(0),   child Window ID=(1)
		ArrayList<String> al = new ArrayList<String>(AllIds);  
		 String ChildWindowID = al.get(2);  
		  
		 //Switch to Child Window 
		 driver.switchTo().window(ChildWindowID);
		 
		}

	public void ClickOM4() throws InterruptedException{
		Thread.sleep(3000);
		OM4.click();
		
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);

		// parent window Id=(0),   child Window ID=(1)
		ArrayList<String> al = new ArrayList<String>(AllIds);  
		 String ChildWindowID = al.get(2);  
		  
		 //Switch to Child Window 
		 driver.switchTo().window(ChildWindowID);
		 
		}

	public void ClickOM6() throws InterruptedException{
		Thread.sleep(3000);
		OM6.click();
		
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);

		// parent window Id=(0),   child Window ID=(1)
		ArrayList<String> al = new ArrayList<String>(AllIds);  
		 String ChildWindowID = al.get(2);  
		  
		 //Switch to Child Window 
		 driver.switchTo().window(ChildWindowID);
		 
		}

}
