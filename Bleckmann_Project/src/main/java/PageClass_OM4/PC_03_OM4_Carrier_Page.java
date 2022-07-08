package PageClass_OM4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_03_OM4_Carrier_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='check'])[1]")
	private WebElement CheckBoxx;
	
    @FindBy(xpath = "//*[@id='button3']")
    private WebElement ConfirmButton;
    
    	
    
	public PC_03_OM4_Carrier_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCheckboxx() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);

		CheckBoxx.click();
		}

	
	public void ClickConfirm() throws InterruptedException{
		Thread.sleep(2000);
		ConfirmButton.click();
		}

}
