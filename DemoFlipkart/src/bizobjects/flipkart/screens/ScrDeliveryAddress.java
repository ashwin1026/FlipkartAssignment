package bizobjects.flipkart.screens;

/*
 * @author - Ajujgar
 * @Date - 21st Mar 2021
 * @Description - This file is to save all the objects of Delivery Address screen and perform required actions on the page
 */

import java.util.TreeMap;
import org.openqa.selenium.WebDriver;
import commonutils.CommonBusiness;

public class ScrDeliveryAddress extends CommonBusiness {

	TreeMap<String, String> scrObjects = new TreeMap<String, String>();

	public ScrDeliveryAddress(){

		scrObjects.put("DeliverHere", "xpath://button[text()='Deliver Here']" );
	}
	
	public void clickOnButton_Link(WebDriver driver, String objectName) {
		clickOnElement(driver, scrObjects, objectName);
		
	}
	
}