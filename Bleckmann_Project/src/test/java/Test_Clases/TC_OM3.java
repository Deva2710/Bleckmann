package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;

public class TC_OM3 extends Listeners {
	

@Test(priority = 1)
public void RunTC_OM3_LoginTest() throws InterruptedException {
	
	log.info("TC_01_ enter username");
	OM3_1.EnterUsername();
	
	log.info("TC_01_ enter password");
	OM3_1.EnterPassword();

	log.info("TC_01_ click to submit");
	OM3_1.ClickSubmit();
}


@Test(priority = 2 , enabled = false )
public void RunTC_OM3_ModulesTest() throws InterruptedException {
	
	log.info("TC_02_ Click on Return modules");
	OM3_2.ClickReturn();
}


@Test(priority = 3 )
public void RunTC_OM3_CustomersTest() throws InterruptedException {
	
	
	log.info("TC_03_ enter customers name");
	OM3_3.EnterCustomerName();
	
	log.info("TC_03_ Click on OM3");
	OM3_3.ClickOM3();
}


@Test(priority = 4)
public void RunTC_OM3_ReturnOrderTest() throws InterruptedException {

	log.info("TC_01_ enter First name ");
	OM3_4.EnterFirstName();
	
	log.info("TC_01_ enter Street address");
	OM3_4.EnterStreet();
	
	log.info("TC_01_ enter house number");
	OM3_4.EnterHouseNumber();
	
	log.info("TC_01_ enter postal code");
	OM3_4.EnterPostalCodesss();
	
	log.info("TC_01_ enter city name");
	OM3_4.EnterCity();
	
	log.info("TC_01_ click on dropdown");
	OM3_4.ClickDropDown();
	
	log.info("TC_01_ click on enter country name ");
	OM3_4.EnterCountry();

	log.info("TC_01_ click on submit button");
	OM3_4.ClickSubmit();
}


@Test(priority = 5)
public void RunTC_OM3_Carrier_Test() throws InterruptedException {
	
	log.info("TC_01_ click on checkbox of carrier");
	OM3_5.ClickCheckbox();
	
	log.info("TC_01_ click to continue");
	OM3_5.ClickContinue();
}
}
