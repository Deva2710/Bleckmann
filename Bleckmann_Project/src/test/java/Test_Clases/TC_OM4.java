package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;

public class TC_OM4 extends Listeners {
	

@Test(priority = 1)
public void RunTC_OM4_LoginTest() throws InterruptedException {
	
	log.info("TC_01_ enter username");
	OM3_1.EnterUsername();
	
	log.info("TC_01_ enter password");
	OM3_1.EnterPassword();

	log.info("TC_01_ click to submit");
	OM3_1.ClickSubmit();
}


@Test(priority = 2 , enabled = false )
public void RunTC_OM4_ModulesTest() throws InterruptedException {
	
	log.info("TC_02_ Click on Return modules");
	OM3_2.ClickReturn();
}


@Test(priority = 3 )
public void RunTC_OM4_CustomersTest() throws InterruptedException {
	
	
	log.info("TC_03_ enter customers name");
	OM3_3.EnterCustomerName();
	
	log.info("TC_03_ Click on OM3");
	OM3_3.ClickOM4();
}

@Test(priority = 4)
public void RunPC_OM4_ReturnOrder_Page() throws InterruptedException {
	
	log.info("TC_01_ send order ID");
	OM4_1.SendOrderID();
	
	log.info("TC_01_ click to search");
	OM4_1.ClickSearch();
	
	log.info("TC_01_ click to return");
	OM4_1.ClickReturn();
}


@Test(priority = 5)
public void RunTC_OM4_ReturnItem_Test() throws InterruptedException {
	
	log.info("TC_02_ Click on checkox ");
	OM4_2.ClickCheckBox();
	
	log.info("TC_02_ Click to drp down");
	OM4_2.ClickDropDown();
	
	log.info("TC_02_ enter return resone");
	OM4_2.enterReturnReason();
	
	log.info("TC_02_ Click to submit");
	OM4_2.ClickSubmit();	
}

@Test(priority = 6, enabled = true)
public void RunTC_03_Carrier_Test() throws InterruptedException {
	
	log.info("TC_01_ click on checkbox for carrier ");
	OM4_3.ClickCheckboxx();
	
	log.info("TC_01_ click to confirmn ");
	OM4_3.ClickConfirm();
	
}



}
