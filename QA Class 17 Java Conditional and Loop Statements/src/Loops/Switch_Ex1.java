package Loops;

public class Switch_Ex1 {

	public static void main(String[] args) {

     String browser="chrome";
     
     
     switch(browser) {
     
     case "chrome":
    	 System.out.println("launch chrome browser");
    	 break;
     case "firefox":
    	 System.out.println("launch firefox browser");
    	 break;
     case "edge":
    	 System.out.println("launch edge browser");
    	 break;
    	 
       default:
    	 System.out.println("invalid browser");
    	 break;
     
     
     }
     
	}

}
