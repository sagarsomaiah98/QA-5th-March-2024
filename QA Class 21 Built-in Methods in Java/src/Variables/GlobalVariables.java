package Variables;

public class GlobalVariables {
	
	//global or class variables 
	
	//variable defined outside the method

	String name="John";
	int age = 25;
	
	
	public void city1() {
		
		
		System.out.println(name);
        System.out.println(age);		
	}
	
	
	public void city2() {
		System.out.println(name);
        System.out.println(age);	
		
	}

	public static void main(String[] args) {
		
		GlobalVariables g = new GlobalVariables();
		
	   g.city2();
		System.out.println(g.name);
		System.out.println(g.age);
	

	}

}
