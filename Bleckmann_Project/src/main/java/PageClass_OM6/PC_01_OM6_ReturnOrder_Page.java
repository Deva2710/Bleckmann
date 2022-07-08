package PageClass_OM6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_01_OM6_ReturnOrder_Page {
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@id='Consumername1']")
	private WebElement FirstName;
	
	@FindBy(xpath = "//*[@id='ConsumerShipStreet1']")
	private WebElement Street;
	
	@FindBy(xpath = "//*[@id='ConsumerFromShipHouseNumber']")
	private WebElement HouseNumber;
	
	@FindBy(xpath = "//*[@id='ConsumerFromShipPostalCode']")
	private WebElement PostalCodesss;
	
	@FindBy(xpath = "//*[@id='ConsumerFromShipCity']")
	private WebElement City;
	
	@FindBy(xpath = "//*[@id='select2-ConsumerFromShipCountry-container']")
	private WebElement DropDown;
	
	@FindBy(xpath = "//*[@class='select2-search__field']")
	private WebElement Country;
	
	
	@FindBy(xpath = "(//*[@id='button1'])[2]")
	private WebElement Submit;
    
	public PC_01_OM6_ReturnOrder_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void EnterFirstName() throws InterruptedException {
		Thread.sleep(2000);
		FirstName.click();
		FirstName.sendKeys("TEST");
		}
	
	public void EnterStreet() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		Street.click();
		Street.sendKeys("TESTSTREET");
		}
	
	
	public void EnterHouseNumber() throws InterruptedException {
		Thread.sleep(2000);
		HouseNumber.click();
		HouseNumber.sendKeys("1");	
	}
	
	public void EnterPostalCodesss() throws InterruptedException {
		Thread.sleep(2000);
		PostalCodesss.click();
		PostalCodesss.sendKeys("1234");	
	}
	
	public void EnterCity() throws InterruptedException {
		Thread.sleep(2000);
		City.click();
		City.sendKeys("TESTCITY");	
	}
	
	public void ClickDropDown() throws InterruptedException {
		Thread.sleep(2000);
		DropDown.click();
	}
	
	public void EnterCountry() throws InterruptedException {
		Thread.sleep(2000);
		Country.sendKeys("BELGIUM");
		Country.sendKeys(Keys.ENTER);

	}
	
	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(2000);
		Submit.click();
	}
	
	
	

}
