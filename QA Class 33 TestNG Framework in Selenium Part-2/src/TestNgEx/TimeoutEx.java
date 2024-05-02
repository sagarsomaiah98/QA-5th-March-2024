package TestNgEx;

import org.testng.annotations.Test;

public class TimeoutEx {
	
	
	@Test(invocationTimeOut=10)
	public void test() {
		
		int i=10;
		
		while(i<20) {
			System.out.println(" printing i value -> "+i);
		}
	}

}
