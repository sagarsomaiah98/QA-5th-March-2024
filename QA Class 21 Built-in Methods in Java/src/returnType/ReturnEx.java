package returnType;

public class ReturnEx {
	
	
	
	public int method1()
	{
		
		int a=10;
		int b=20;
		int c=4;
		
		int out=b-c+a;
		
		return out;
		
		
	}
	

	public static void main(String[] args) {
		
		ReturnEx r= new ReturnEx();
		int val= r.method1();
		System.out.println(val);
		if(val%2==0)
System.out.println("even number");
		else
			System.out.println("odd number");
	

	}

}
