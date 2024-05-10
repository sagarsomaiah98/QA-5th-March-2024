package pages;

import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class SearchPage extends TestBase {
	
	public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}

}
