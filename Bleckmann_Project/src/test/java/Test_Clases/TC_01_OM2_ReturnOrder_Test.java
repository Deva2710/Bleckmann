package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;



public class TC_01_OM2_ReturnOrder_Test extends Listeners {
@Test
public void RunTC_01_ReturnOrder_Test() throws InterruptedException {
	
	log.info("TC_01_ enter order id");
	OM2_1.SendOrderID();
	
	log.info("TC_01_ enter mail id");
	OM2_1.SendEmailID();
	
	log.info("TC_01_ click on submit button");
	OM2_1.ClickSubmit();
	
	
	  
}
}
