import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_1 {
	
public static void main(String[] args) {
	

      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	       driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("google");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	
		driver.quit();
		
	}

}
