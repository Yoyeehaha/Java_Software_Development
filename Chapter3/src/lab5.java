
import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println("num="+num);
		
		scanner.nextLine(); // get rid of \n
		
		String line2 = scanner.nextLine();
		System.out.println("line="+line2);

	}

}
