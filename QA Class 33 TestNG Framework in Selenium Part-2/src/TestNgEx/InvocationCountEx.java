package TestNgEx;

import org.testng.annotations.Test;

public class InvocationCountEx {
	
	@Test(invocationCount=10)
	public void logintest() {
		
		System.out.println(" executing logintest ");
	}
	
	@Test(invocationCount=3)
	public void ordertest() {
		
		System.out.println(" executing ordertest ");
	}

}
