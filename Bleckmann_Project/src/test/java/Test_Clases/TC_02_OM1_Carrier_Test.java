package Test_Clases;

import org.testng.annotations.Test;

import Extent_Listeners.Listeners;

public class TC_02_OM1_Carrier_Test extends Listeners {
	

@Test
public void RunTC_02_OM1_Carrier_Test() throws InterruptedException {
	
	log.info("TC_01_ click on checkbox of carrier");
	OM1_2.ClickCheckbox();
	
	log.info("TC_01_ click to continue");
	OM1_2.ClickContinue();

}
}
