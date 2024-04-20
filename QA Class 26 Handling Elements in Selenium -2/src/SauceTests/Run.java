package SauceTests;

public class Run {

	public static void main(String[] args) {
		LoginTest login= new LoginTest();
		login.logintest();
		
		AddToCartTest addcart= new AddToCartTest();
		addcart.addtocart();
		
		OrderTest order = new OrderTest();
		order.order();

	}

}
