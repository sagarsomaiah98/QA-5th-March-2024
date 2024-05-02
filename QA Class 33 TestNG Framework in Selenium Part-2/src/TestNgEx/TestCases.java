package TestNgEx;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test(groups={"regression"})
	public void logintest() {
		System.out.println("login test");
	}
	
	@Test(groups={"regression"})
	public void forgotpaswordtest() {
		
		System.out.println("forgot password test");
	}
	
	@Test(groups={"sanity"})
	public void registertest() {
		
		System.out.println("register test");
	}
	@Test(groups={"smoke"})
	public void carttest() {
		System.out.println("cart test");
	}
	@Test(groups="smoke")
	public void ordertest() {
		System.out.println("order test");
	}

	@Test(groups={"regression","smoke"})
	public void filtertest() {
		
		System.out.println("filter test");
	}
	
	@Test(groups={"smoke"})
	public void logouttest() {
		System.out.println("logout test");
	}
}
