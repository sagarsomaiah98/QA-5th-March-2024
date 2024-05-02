package TestNgEx;

import org.testng.annotations.Test;

public class ExpectedExceptionsEx {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test() {
		int[] arr= new int[4];
		arr[10]=30;
		int a=10;
		int c=10/0;
		
		
	}

}
