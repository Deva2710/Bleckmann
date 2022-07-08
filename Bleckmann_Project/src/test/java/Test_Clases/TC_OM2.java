package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;



public class TC_OM2 extends Listeners {
	
@Test(priority = 1)
public void RunTC_01_ReturnOrder_Test() throws InterruptedException {
	
	log.info("TC_01_ enter order id");
	OM2_1.SendOrderID();
	
	log.info("TC_01_ enter mail id");
	OM2_1.SendEmailID();
	
	log.info("TC_01_ click on submit button");
	OM2_1.ClickSubmit(); 
}

@Test(priority = 2)
public void RunTC_02_OM2_ReturnItem_Test() throws InterruptedException {
	
	log.info("TC_01_ enter order id");
	OM2_2.ClickCheckBox();
	
	log.info("TC_01_ enter mail id");
	OM2_2.ClickDropDown();
	
	log.info("TC_01_ enter mail id");
	OM2_2.enterReturnReason();
	
	log.info("TC_01_ enter mail id");
	OM2_2.ClickSubmit();	
}

@Test(priority = 3)
public void RunTC_03_Carrier_Test() throws InterruptedException {
	
	log.info("TC_01_ enter order id");
	OM2_3.ClickCheckboxx();
	
	log.info("TC_01_ enter mail id");
	OM2_3.ClickContinue();
	
}

}
