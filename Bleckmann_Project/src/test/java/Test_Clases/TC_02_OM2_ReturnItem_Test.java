package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;


	

public class TC_02_OM2_ReturnItem_Test extends Listeners {
@Test
public void RunTC_02_ReturnPortal_Test() throws InterruptedException {
	
	log.info("TC_01_ enter order id");
	OM2_2.ClickCheckBox();
	
	log.info("TC_01_ enter mail id");
	OM2_2.ClickDropDown();
	
	log.info("TC_01_ enter mail id");
	OM2_2.enterReturnReason();
	
	log.info("TC_01_ enter mail id");
	OM2_2.ClickSubmit();
	
}
}