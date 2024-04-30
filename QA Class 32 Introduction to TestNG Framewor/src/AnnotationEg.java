
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationEg {
	@AfterClass
	public void afterclass() {
		
		System.out.println("calling after class");
	}
	
	
	@Test
	public void method1() {
		System.out.println("calling method1");
	}
	
	@Test
	public void method2() {
		System.out.println("calling method2");
	}
	
	
	@Test
	public void method3() {
		System.out.println("calling method3");
	}
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("calling after method");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("calling before class");
	}
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("calling before test");
	}
	@AfterTest
	public void aftertest() {
		
		System.out.println("calling after test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("calling before method");
	}

}
