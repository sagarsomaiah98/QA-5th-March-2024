

package Methods;

public class Employee {
	double salary=2345.23;
	String name="Lee";
	int age=30;

	
	
	public void info() {
		char grade='A';
		String role="Manager";
		System.out.println(grade);
		System.out.println(role);
		
		
	}
	
	public void display() {
		
		System.out.println("Calling display method");
	}

	public static void main(String[] args) {
	
		Employee e1= new Employee();//key or object
		e1.info();
		e1.display();
		
		System.out.println(e1.salary);
		System.out.println(e1.name);
		System.out.println(e1.age);
   

	}

}
