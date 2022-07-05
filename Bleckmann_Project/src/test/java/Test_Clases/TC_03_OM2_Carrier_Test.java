package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;

public class TC_03_OM2_Carrier_Test extends Listeners {
@Test
public void RunTC_03_Carrier_Test() throws InterruptedException {
	
	log.info("TC_01_ enter order id");
	OM2_3.ClickCheckboxx();
	
	log.info("TC_01_ enter mail id");
	OM2_3.ClickContinue();
	
}
}
