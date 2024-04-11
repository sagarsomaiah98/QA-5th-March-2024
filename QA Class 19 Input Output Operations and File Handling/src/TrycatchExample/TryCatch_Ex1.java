package TrycatchExample;

public class TryCatch_Ex1 {

	public static void main(String[] args) {
		
		try 
		{
		 int a = 2;
         int b = 0;
         int c = a/b;  // cannot divide by zero
         System.out.println ("Result = " + c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println("cannot divide");
			
		}
		
         System.out.println("eND OF THE PROGRAM");
         int k=40;
         int m=30;
         int u=k+m;   
         System.out.println("addition of "+k+" and "+m +" is "+u);


	}

}
