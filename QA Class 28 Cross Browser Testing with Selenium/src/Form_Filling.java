
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling  {
	
	public static int randomID() {
		
		 int value=  (int) (Math.random()*10000);
		  System.out.println(value);
		  return value;
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		int id=randomID();
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("wayne");
	driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("24 albert street");
	driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("newyork");
	driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("UAN");
	driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2456");
	driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("2332324324");
	driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("john"+id);
	driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
   driver.findElement(By.xpath("//input[@value='Register']")).click();
    

	//driver.quit();

		 
		
		
		
	

	}

}
