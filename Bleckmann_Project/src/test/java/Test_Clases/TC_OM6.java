package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;

public class TC_OM6 extends Listeners {
	

@Test(priority = 1)
public void RunTC_01_OM1_ReturnOrder_Test() throws InterruptedException {
	
	log.info("TC_01_ enter First name ");
	OM1_1.EnterFirstName();
	
	log.info("TC_01_ enter Street address");
	OM1_1.EnterStreet();
	
	log.info("TC_01_ enter house number");
	OM1_1.EnterHouseNumber();
	
	log.info("TC_01_ enter postal code");
	OM1_1.EnterPostalCodesss();
	
	log.info("TC_01_ enter city name");
	OM1_1.EnterCity();
	
	log.info("TC_01_ click on dropdown");
	OM1_1.ClickDropDown();
	
	log.info("TC_01_ click on enter country name ");
	OM1_1.EnterCountry();

	log.info("TC_01_ click on submit button");
	OM1_1.ClickSubmit();
}

@Test(priority = 2)
public void RunTC_02_OM1_Carrier_Test() throws InterruptedException {
	
	log.info("TC_01_ click on checkbox of carrier");
	OM1_2.ClickCheckbox();
	
	log.info("TC_01_ click to continue");
	OM1_2.ClickContinue();

}


}
