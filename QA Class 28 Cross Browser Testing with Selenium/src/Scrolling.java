
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scrolling  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trustpilot.com/review/janbasktraining.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");//top to bottom
		Thread.sleep(3000);
		/*
		 * js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 */
		
		js.executeScript("window.scrollTo(10000,1000)");//bottom to top
		js.executeScript("window.scrollTo(1000,0)");
		
		

	}

}
