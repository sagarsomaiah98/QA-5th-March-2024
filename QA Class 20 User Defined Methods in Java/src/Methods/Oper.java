package Methods;

public class Oper {
	
	public void maximum(){
		
		int g=100;
		int h=50;
		if(g>h)
			System.out.println("Maximum number is "+g);
		else
			System.out.println("Maximum number is "+h);
	}
	
	public void sqrt(){
		
		int j=19;
		int sqrt=j*j;
		System.out.println("Square Root of "+j+" is "+sqrt);
	}
	

	public static void main(String[] args) {
		
		Oper op= new Oper();
		op.maximum();
		op.sqrt();
		
		
		
		
		
	}

}
