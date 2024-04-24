

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action= new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(button).build().perform();//right click
		

		

		
		
		
	}

}
