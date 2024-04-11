package TrycatchExample;

public class Trycatchex {

	public static void main(String[] args) {
		String[] stud= new String[5];
		try 
		{
		 stud[2]="steve";
		 stud[4]="mark";
		 stud[0]="tom";
		 stud[1]="lee";
		}
		catch(Exception e) {
			
			System.out.println("try block failed");
			
		}
		 
		 System.out.println(stud[2]);
		 System.out.println(stud[4]);
		 System.out.println(stud[0]);
		
		
	}

}
