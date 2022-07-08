package PageClass_OM6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_02_OM6_Carrier_Page {

WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='check'])[5]")
	private WebElement CheckBoxx;
	
    @FindBy(xpath = "(//*[@class='btn btn-raised btn-block btn-success btn-bm'])[3]")
    private WebElement ContinueButton;
    
    	
    
	public PC_02_OM6_Carrier_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		CheckBoxx.click();
		}

	
	public void ClickContinue() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		ContinueButton.click();
		}
	
}
