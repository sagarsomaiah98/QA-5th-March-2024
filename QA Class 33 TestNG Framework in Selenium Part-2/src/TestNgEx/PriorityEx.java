package TestNgEx;

import org.testng.annotations.Test;

public class PriorityEx {
	
	@Test(priority=-2)
	public void order() {
		System.out.println("***********  ORDER TEST  ****************");
	}
	
	
	@Test(priority=-1)
	public void logout() {
		System.out.println("***********  LOGOOUT TEST  ****************");
	}

	
	@Test(priority=1)
	public void addtocart() {
		System.out.println("***********  ADD TO CART TEST  ****************");
	}

	
	@Test(priority=2)
	public void filter() {
		System.out.println("***********  FILTER TEST  ****************");
	}


}
