package PageClass_OM4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_01_OM4_ReturnOrder_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@name='Orderid']")
	private WebElement OrderID;
	
	@FindBy(xpath = "//*[@id='btn_create_ro']")
	private WebElement Search;
	
	@FindBy(xpath = "//*[@class='btn btn-success btn-raised btngetOrderLine btn-sm ']")
	private WebElement Return;
	
	
    
	public PC_01_OM4_ReturnOrder_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SendOrderID() throws InterruptedException {
		Thread.sleep(2000);
		OrderID.sendKeys("230054927");
		}
	
	public void ClickSearch() throws InterruptedException {
		Thread.sleep(2000);
		Search.click();
		
	}
	
	public void ClickReturn() throws InterruptedException {
		Thread.sleep(2000);
		Return.click();
		
	}

}
