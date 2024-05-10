package pages;

import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class ShoppingCartPage extends TestBase {
	
	public ShoppingCartPage() {
		
		PageFactory.initElements(driver, this);
	}

}
