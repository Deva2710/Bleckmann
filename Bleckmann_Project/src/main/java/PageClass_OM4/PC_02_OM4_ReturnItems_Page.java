package PageClass_OM4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_02_OM4_ReturnItems_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@id='selectSKU-AFM1735F1090']")
	private WebElement Checkbox;
	
	@FindBy(xpath = "((//a[contains(text(),'INSTINCT 4-M WHITE / RED SIZE 9')]//ancestor::tr/td[5]/div)[1]//child::span)[3]")
	private WebElement DropDown;
	
    @FindBy(xpath = "//*[@class='select2-search__field']")
    private WebElement ReturnReason;
    
    @FindBy(xpath = "//button[@id='button2']")
    private WebElement submit;
      	
    
	public PC_02_OM4_ReturnItems_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void ClickCheckBox() throws InterruptedException {
		Thread.sleep(5000);
		Checkbox.click();
		}
	
	public void ClickDropDown() throws InterruptedException {
		Thread.sleep(2000);
		DropDown.click();
		}
	
	public void enterReturnReason() throws InterruptedException {
		Thread.sleep(2000);
		ReturnReason.sendKeys("Defected Product 1");
		ReturnReason.sendKeys(Keys.ENTER);

		}
	
	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		submit.click();
		}

}
