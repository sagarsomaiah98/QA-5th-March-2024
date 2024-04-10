package Loops;

public class Switch_Ex {

	public static void main(String[] args) {
		
		char john_grade='d';
		
		
		switch(john_grade) {//switch(d)
		
		case 'A':
			System.out.println("Best");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Better");
			break;
		case 'D':
			System.out.println("Fail");
			break;
			
			default:
				System.out.println("invalid grade");
			
			
		
		}

	}

}
