package bizobjects.flipkart.screens;

/*
 * @author - Ajujgar
 * @Date - 21st Mar 2021
 * @Description - This file is to save all the objects of Cart screen and perform required actions on the page
 */

import java.util.TreeMap;
import org.openqa.selenium.WebDriver;
import commonutils.CommonBusiness;

public class ScrCart extends CommonBusiness {

	TreeMap<String, String> scrObjects = new TreeMap<String, String>();

	
	public ScrCart(){
		//Cart screen objects
		scrObjects.put("OppoA3sRed16GB", 	"xpath://a[text()='OPPO A3s (Red, 16 GB)']");
		scrObjects.put("PlaceOrder", 		"xpath://span[text()='Place Order']");
	}

	public void clickOnButton_Link(WebDriver driver, String objectName) {
		clickOnElement(driver, scrObjects, objectName);

	}

	public boolean isElementVisible(WebDriver driver, String objectName) {
		return checkVisibilityOfElement(driver,scrObjects,objectName);
	}
	
}