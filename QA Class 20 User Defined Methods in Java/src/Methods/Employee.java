

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
	
	Employee emp= new Employee();
	System.out.println(emp.salary);
	System.out.println(emp.name);
	System.out.println(emp.age);
	emp.info();
	emp.display();
	

	}

}
