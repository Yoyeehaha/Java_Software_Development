
import java.util.Scanner;
import java.io.FileInputStream;
import java.text.DecimalFormat;

public class lab8 {

	public static void main(String[] args) {
	    try {
	    	Scanner scanner = new Scanner(new FileInputStream("C:\\test.txt"));
	        String name = scanner.nextLine();
	        String id = scanner.nextLine();
	        String school = scanner.nextLine();
	        
	        System.out.println("name:" + name);
	        System.out.println("id:" + id);
	        System.out.println("school:" + school);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
		
	}

}
