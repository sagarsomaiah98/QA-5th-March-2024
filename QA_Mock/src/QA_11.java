import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		 WebElement t = driver.findElement(By.xpath("//*[@id='table1']/tbody"));
		  List<WebElement> rws = t.findElements(By.tagName("tr"));
		  
		  int rws_cnt = rws.size();
	        //iterate rows of table
	        for (int i = 0;i < rws_cnt; i++) {
	        // count columns with size() method
	        List<WebElement> cols = rws.get(i).findElements(By.tagName("td"));
	        int cols_cnt = cols.size();
	        //iterate cols of table
	        for (int j = 0;j < cols_cnt; j++) {
	        // get cell text with getText()
	        String c = cols.get(j).getText();
	     System.out.println("The cell value is: " + c);

	}

}
}
}