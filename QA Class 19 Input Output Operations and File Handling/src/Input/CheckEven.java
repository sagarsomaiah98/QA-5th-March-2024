package Input;

import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		
		if(input%2==0)

			System.out.println(input+ " is even number");
		else
			System.out.println(input+" is odd number");
	}

}
