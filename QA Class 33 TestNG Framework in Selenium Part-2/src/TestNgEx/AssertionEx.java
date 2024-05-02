package TestNgEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionEx {
	
	@Test
	public void comparetest() {
		
		String name="Mike";
		/*
		 * if(name.equals("mike")) System.out.println("test passed"); else
		 * System.out.println("test failed");
		 */
		
		assertEquals(name, "Mike");
		
	}
	
	@Test
	public void comparetest1() {
		
		String name="Mike";
		/*
		 * if(name.equals("mike")) System.out.println("test passed"); else
		 * System.out.println("test failed");
		 */
		
		assertEquals(23, 23);
		
	}
	
	@Test
	public void comparetest2() {
		
		String name="Mike";
		/*
		 * if(name.equals("mike")) System.out.println("test passed"); else
		 * System.out.println("test failed");
		 */
		
		assertEquals("peter","mark","values are not matching");
		
	}

}
