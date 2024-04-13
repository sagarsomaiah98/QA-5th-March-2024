package Variables;

public class LocalVariable {
	
	//local variable- variable defined inside the method, these local variable cannot be accessed outside the method
	
	public void city1() {
		
		int age=25;
		String name="Sam";
		double salary=45.61;
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public void city2() {
		double salary=23432.444;
		int age=45;
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
	
	  LocalVariable l= new LocalVariable();
	  l.city2();

	}

}
