package ExceptionExamples;

public class ArrayOutofboundExample {

	public static void main(String[] args) {
		int a[] = new int[10];
        a[20] = 9; 
        System.out.println(a[2]);
        System.out.println("end of the excpetion");
    

	}

}
