package Parameters;

public class Maths {
	
	public void addition(int a, int b)
	{
	
	int c=a+b;
	System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}
	
	public void subthreenumber(double i, double j, double k) {
		
		
		double m=i-j-k;
		
		System.out.println("Subtraction of three numbers "+i+" and "+j+" and "+k+" is "+m);
	}
	
	public static void main(String[] args) {
		
		Maths m = new Maths();
		m.addition(10,20);
		m.addition(60,30);
		m.addition(70,15);
		m.addition(888,556);
		m.addition(7855,125);
		m.addition(963,4556);
		m.addition(7889,852);
		
		m.subthreenumber(100.23, 85.3, 2.5);
	}

}
