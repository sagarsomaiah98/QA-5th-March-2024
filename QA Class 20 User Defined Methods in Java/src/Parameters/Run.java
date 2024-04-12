package Parameters;

import Methods.CalcFunction;

public class Run {

	public static void main(String[] args) {
		Maths m= new Maths();
		m.addition(12, 10);
		
		Student s= new Student();
		s.disp("Jack", 'A', 20, true, 6.4);
		
		CalcFunction c = new CalcFunction();
		c.addition();
		c.subtraction();
	
	}

}
