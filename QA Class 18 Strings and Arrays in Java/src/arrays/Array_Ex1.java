package arrays;

public class Array_Ex1 {

	public static void main(String[] args) {
   String[]  stud=new String[7];
        stud[0]="stev";
		
		stud[1]="mark";
		
		stud[2]="john";
		stud[3]="stark";
		
		stud[4]="tony";
		stud[5]="carley";
		stud[6]="tom";
		
		System.out.println(stud.length);
	
		
		for(int i=0;i<stud.length;i++) {
			
			System.out.println(stud[i]);
		}

	}

}
