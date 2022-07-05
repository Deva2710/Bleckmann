package Page_Clases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_03_OM2_Carrier_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='check'])[1]")
	private WebElement CheckBoxx;
	
    @FindBy(xpath = "(//*[text()='Click Here to Continue'])[1]")
    private WebElement ContinueButton;
    
    	
    
	public PC_03_OM2_Carrier_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCheckboxx() throws InterruptedException {
		Thread.sleep(2000);
		CheckBoxx.click();
		}

	
	public void ClickContinue() throws InterruptedException{
		Thread.sleep(2000);
		ContinueButton.click();
		}

}
