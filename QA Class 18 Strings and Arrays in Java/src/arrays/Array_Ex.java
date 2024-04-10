package arrays;

public class Array_Ex {

	public static void main(String[] args) {
		
		//Datatype[] arrayName= new DataType[size]
		
		String[]  stud=new String[5];
		
		stud[3]="mark";
		
		stud[1]="john";
		stud[3]="stark";
		
		stud[1]="tony";
		stud[2]="carley";
		stud[3]="tom";
		stud[20]="Peter";
		
		System.out.println(stud[0]);//null
		System.out.println(stud[1]);//john null tony 

		System.out.println(stud[2]);//carley
		System.out.println(stud[3]);//
		
		System.out.println(stud[13]);



	}

}
