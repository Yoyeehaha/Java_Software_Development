import java.util.Scanner;

public class hw3 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		Point mainpoint = new Point();
		Point otherpoint = new Point();
		
		mainpoint.Set(x1, y1);
		otherpoint.Set(x2, y2);
		System.out.println(mainpoint.RetreiveVertical() + " "+ mainpoint.RetreiveHorizontal());
		mainpoint.Move(a, b);
		System.out.println(mainpoint.RetreiveVertical() + " "+ mainpoint.RetreiveHorizontal());
		
		for(int x = 0;x < 4;x++) {
			mainpoint.Rotate();
		    System.out.println(mainpoint.RetreiveVertical() + " "+ mainpoint.RetreiveHorizontal());	
		}
		
		System.out.println(mainpoint.CalculateManhattanDistance(otherpoint));
		System.out.println(mainpoint.CalculateChebyshevDistance(otherpoint));
        
	}
}
