package PageClass_OM3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_05_OM3_Carrier_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='check'])[1]")
	private WebElement CheckBoxx;
	
    @FindBy(xpath = "//*[@id='button3']")
    private WebElement ContinueButton;
    
    	
    
	public PC_05_OM3_Carrier_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		CheckBoxx.click();
		}

	
	public void ClickContinue() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		ContinueButton.click();
		Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-800)");


		
		}

}
