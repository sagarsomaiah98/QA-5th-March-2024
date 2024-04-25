import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement drop=driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select sel= new Select(drop);
		sel.selectByValue("avatar");
		
		

		
	

	}

}
