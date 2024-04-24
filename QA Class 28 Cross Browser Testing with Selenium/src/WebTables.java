import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']/tbody"));//entire table
		List<WebElement> rows=table.findElements(By.tagName("tr"));//find elements with tag name tr
		List<WebElement> row1= rows.get(0).findElements(By.tagName("td"));
		List<WebElement> row2= rows.get(1).findElements(By.tagName("td"));
		List<WebElement> row3= rows.get(2).findElements(By.tagName("td"));
		List<WebElement> row4= rows.get(3).findElements(By.tagName("td"));
		
		
		String name=row1.get(0).getText();		
		String age=row1.get(1).getText();		
		String place=row1.get(2).getText();
		System.out.print(name+" |");
		System.out.print(age+" | ");
		System.out.print(place+" |");
		
		System.out.println();
		
		 name=row2.get(0).getText();		
		 age=row2.get(1).getText();		
		 place=row2.get(2).getText();
		System.out.print(name+" |");
		System.out.print(age+" | ");
		System.out.print(place+" |");
		System.out.println();
		
		 name=row3.get(0).getText();		
		 age=row3.get(1).getText();		
		 place=row3.get(2).getText();
		System.out.print(name+" |");
		System.out.print(age+" | ");
		System.out.print(place+" |");
		System.out.println();
		
		 name=row4.get(0).getText();		
		 age=row4.get(1).getText();		
		 place=row4.get(2).getText();
		System.out.print(name+" |");
		System.out.print(age+" | ");
		System.out.print(place+" |");
		
		driver.quit();
	}

}
