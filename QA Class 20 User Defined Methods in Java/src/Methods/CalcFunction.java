package Methods;

public class CalcFunction {
	
	//AccessModifier ReturnType Method/FunctionName
	
	public void addition()
	{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}
	
	public void subtraction()
	
	{
	int j=50;
	int k=15;
	int m=j-k;
	System.out.println("Subtraction of two numbers "+j+" and "+k+" is "+m);
	}

	public static void main(String[] args) {
		//to access anything outside the main we need to create a object first then use the object to call the function
		
		//className object = new ClassName()
   CalcFunction cal= new CalcFunction();
   cal.addition();
   cal.addition();
   cal.addition();
   cal.addition();
   cal.addition();
   
  cal.subtraction();
 
		
	}

}
