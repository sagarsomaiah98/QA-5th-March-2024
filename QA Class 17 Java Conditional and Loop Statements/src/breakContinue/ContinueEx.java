package breakContinue;

public class ContinueEx {

	public static void main(String[] args) {
int key=10;
		
		for(int i=0;i<20;i++) {
			if(key>i)
				continue;
			
			System.out.println(i);
		}

	}

}
