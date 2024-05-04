package testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	FileInputStream fis;
	Properties prop;
	public static WebDriver driver;
	
	public void intialization() throws IOException {
       fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		
		prop= new Properties();
		prop.load(fis);
		String browser=prop.getProperty("Browser");
		String url=prop.getProperty("Url");
		int timeOut=Integer.parseInt(prop.getProperty("Timeout"));
		
		//launches the browser specified in config properties
		
		switch(browser) {
		case "Chrome":
			driver= new ChromeDriver();
			break;
		case "Firefox":
		   driver= new FirefoxDriver();
		   break;
		case "Edge":
			   driver= new EdgeDriver();
			   break;
		default:
			System.out.println("Invalid browser:"+browser +" not supported");
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
		driver.get(url);
		
		}
		
	}


