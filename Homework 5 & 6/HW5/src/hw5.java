import java.util.ArrayList;
import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		ArrayList<char[]> board = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			line = line.replaceAll(" ", "");
			char[] letter = new char[line.length()];
            for (int j = 0; j < m; j++) {
                letter[j] = line.charAt(j);
            }
            board.add(letter);
        }
		
		String target = sc.nextLine();
	    sc.close();
	    
	    boolean result = false;
	    for(int i = 0;i < n;i++) {
	    	for(int j = 0;j < m;j++) {
	    		if(DFS(board, target, i, j, 0)) {
	    			result = true;
	    		}
	    	}
	    }
	    System.out.println(result);

	}

	public static boolean DFS(ArrayList<char[]> board, String target, int i, int j, int k) {
		
		int n = board.size();
		int m = board.get(0).length;
		
		if(i < 0 || j < 0 || i >= n || j >= m) {
			return false;
		}
		
		if(board.get(i)[j] == target.charAt(k)) {
			char temp = board.get(i)[j];
			board.get(i)[j] = '@';
			if(k == target.length() - 1) {
				return true;
			} else if(DFS(board, target, i+1, j, k+1) || DFS(board, target, i-1, j, k+1) || DFS(board, target, i, j+1, k+1) || DFS(board, target, i, j-1, k+1)) {
				return true;
			}
			board.get(i)[j] = temp;
		}
		
		return false;
	}

}
