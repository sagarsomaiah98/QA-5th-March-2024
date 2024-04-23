
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	//https://chercher.tech/practice/practice-pop-ups-selenium-webdriver

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
	//	al.accept(); // click ok on pop up/alert box
		String text=al.getText();
		al.dismiss();// click cancel on pop up /alert box
		System.out.println(text);
		driver.quit();
	}

}
