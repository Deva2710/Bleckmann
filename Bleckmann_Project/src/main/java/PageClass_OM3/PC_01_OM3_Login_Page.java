package PageClass_OM3;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_01_OM3_Login_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@name='Username']")
	private WebElement Username;
	
	@FindBy(xpath = "//*[@name='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "//*[@class='form-btn g-recaptcha']")
	private WebElement Submit;
	
	
    
	public PC_01_OM3_Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void EnterUsername() throws InterruptedException {
		Thread.sleep(2000);
		Username.click();
		Username.sendKeys("admin");
		}
	
	public void EnterPassword() throws InterruptedException{

		Thread.sleep(2000);
		Password.click();
		Password.sendKeys("19Bleck02!");

		}
	
	
	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
		Submit.click();
	}
	


	
	

}
