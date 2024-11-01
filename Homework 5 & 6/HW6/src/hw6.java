import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        
		sc.close();
		if(check(input)) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
	
	public static boolean check(String input) {
		 int cntX = 0, cntO = 0;
	     for(int i =0;i < 9;i++) {
	         if (input.charAt(i) == 'X') {
	             cntX++;
	         } else if (input.charAt(i) == 'O') {
	             cntO++;
	         }
	     }
	     
	     if(!(cntX == cntO || cntX == cntO + 1)) {
	    	 return false;
	     }
	     
	     boolean Xwin = checkWin(input, 'X');
	     boolean Owin = checkWin(input, 'O');
	     if(Owin && Xwin) {
	    	 return false;
	     }
	     
	     if(Xwin && cntX != cntO + 1) {
	    	 return false;
	     }
	     
	     if(Owin && cntX != cntO) {
	    	 return false;
	     }
	     
	     return true;
	}

	public static boolean checkWin(String input, char c) {
		
		for(int i = 0;i < 3;i++) {
			if(input.charAt(i * 3) == c && input.charAt(i * 3 + 1) == c && input.charAt(i * 3 + 2) == c) {
				return true;
			}
		}
		
		for(int i = 0;i < 3;i++) {
			if(input.charAt(i) == c && input.charAt(i + 3) == c && input.charAt(i + 6) == c) {
				return true;
			}
		}
		
		if((input.charAt(0) == c && input.charAt(4) == c && input.charAt(8) == c) ||  (input.charAt(2) == c && input.charAt(4) == c && input.charAt(6) == c)) {
				return true;
		}
		
		
		return false;
	}

}
