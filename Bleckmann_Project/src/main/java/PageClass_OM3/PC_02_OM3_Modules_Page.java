package PageClass_OM3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_02_OM3_Modules_Page {

WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='icon-holder red'])[1]")
	private WebElement Return1;	
	

	public PC_02_OM3_Modules_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public  void ClickReturn() throws InterruptedException {
		Thread.sleep(3000);
		Return1.click();
		

		}
}
