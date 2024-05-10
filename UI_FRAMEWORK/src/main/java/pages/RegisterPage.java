package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	public WebElement register;
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	public WebElement myAccount;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement emailAddress;

	@FindBy(xpath="//input[@id='input-telephone']")
	public WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//label[normalize-space()='Yes']//input[@name='newsletter']")
	public WebElement subscribeYes;
	
	@FindBy(xpath="//input[@value='0']")
	public WebElement subscribeNo;
	
	@FindBy(xpath="//input[@name='agree']")
	public WebElement privacyPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement Continue;
	
	@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	public WebElement warningFirstName;
	
	@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	public WebElement warningLasttName;
	
	@FindBy(xpath="///div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	public WebElement warningEmail;
	
	@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	public WebElement warningTelephone;
	
	@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	public WebElement warningPassword;
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterAccountDetails(String firstname,String lastname, String email, String telephoneNo,
			String Password, String Confirmpassord) {
		
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		emailAddress.sendKeys(email);
		telephone.sendKeys(telephoneNo);
		password.sendKeys(Password);
		confirmPassword.sendKeys(Confirmpassord);
		privacyPolicy.click();
		Continue.click();
		
		
		
	}
	
	
	

}
