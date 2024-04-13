package Variables;

public class Color {
	String color="blue";
	
	public void display() {
		
		String color="Red";
		System.out.println(color);
		
	}
	
	public void info() {
		
		System.out.println(color);
	}

	public static void main(String[] args) {
		
		Color c = new Color();
		//c.display();
		c.info();

	}

}
