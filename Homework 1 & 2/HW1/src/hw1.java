import java.util.Scanner;
import java.math.BigDecimal;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        sc.close();

        BigDecimal bn1 = new BigDecimal(a);
        BigDecimal bn2 = new BigDecimal(b);
        BigDecimal sum = bn1.add(bn2);
        
        System.out.println(sum);
		
	}

}