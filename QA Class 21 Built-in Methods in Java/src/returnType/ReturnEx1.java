package returnType;

public class ReturnEx1 {
	
	public boolean disp() {
		int a=10;
		double d=23.45;
		String s="Steve";
		char c='A';
		boolean flag=true;
		
		return flag;
		
		
		
		
	}

	public static void main(String[] args) {
		
		ReturnEx1 r= new ReturnEx1();
		
		boolean out=r.disp();
		System.out.println(out);
		

	}

}
