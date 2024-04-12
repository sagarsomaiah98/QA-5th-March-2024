package Parameters;

public class Student {
	
	public void disp(String name, char grade, int age, boolean flag, double height) {
		System.out.println("Student name is ->"+name);
		System.out.println("Student grade is ->"+grade);
		System.out.println("Student age is ->"+age);
		System.out.println("Student flag is ->"+flag);
		System.out.println("Student height is ->"+height);
		
		
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.disp("Kevin", 'A', 12, true, 4.2);
		System.out.println("***************************");
        s.disp("Peter", 'C', 15, false, 5.12);
	}

}
