package PageClass_OM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_01_OM2_ReturnOrder_Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='sc1[Orderid]']")
	private WebElement OrderID;
	
	@FindBy(xpath = "//input[@id='f1']")
	private WebElement Email;
	
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement Submit;
    
    	
    
	public PC_01_OM2_ReturnOrder_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void SendOrderID() throws InterruptedException {
		Thread.sleep(2000);
		OrderID.sendKeys("230054927");
		}

	
	public void SendEmailID() throws InterruptedException{
		Thread.sleep(2000);
		Email.sendKeys("tharuni.reddy@apoyar.eu");
		}
	
	
	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(2000);
		Submit.click();
		
	}

}

