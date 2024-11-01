import java.util.Scanner;
import java.util.ArrayList;

public class hw4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		//input line
		ArrayList<double[]> function = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
	            String[] line = sc.nextLine().split(" ");
	            if(line[0].equals("-999")) {
	            	break;
	            }
	            double[] number = new double[line.length];
	            for (int j = 0; j < n+1; j++) {
	                number[j] = Double.parseDouble(line[j]);
	            }
	            function.add(number);
	    }
		sc.close();
		String answer = solve(function);
		System.out.println(answer);
		
	}

	private static String solve(ArrayList<double[]> function) {
		
		int row = function.size();
		int col = function.get(0).length;
		
		for(int i = 0; i < row; i++) {
			if(function.get(i)[i] != 0) {
			    for (int a = i + 1; a < row; a++) {
                    double fac = function.get(a)[i] / function.get(i)[i];
                    for (int b = i; b < col; b++) {
                        double value = function.get(a)[b] - fac * function.get(i)[b];
                    
                        double temp2 = function.get(a)[b];
                        function.get(a)[b] = value;
                        value = temp2;
                    }
                }
			} else {
				for (int a = i + 1; a < row; a++) {
                    for (int b = i; b < col; b++) {
                        double value = function.get(a)[b] - function.get(i)[b];
                    
                        double temp2 = function.get(a)[b];
                        function.get(a)[b] = value;
                        value = temp2;
                    }
                }
			}
		}
		
		boolean infiniteSolution = false;
		boolean noSolution = false;
		boolean allZero = true;
		
		for(int i = 0;i < row;i++) {
			allZero = true;
			for(int j = 0; j < col - 1;j++) {
				if(function.get(i)[j] != 0) {
				    allZero = false;
				    break;
			    }
			}		
			
			if(allZero && function.get(i)[col-1] != 0) {
				noSolution = true;
				infiniteSolution = false;
				break;
			} else if(allZero && function.get(i)[col-1] == 0) {
				infiniteSolution = true;
			}
		}
		
		
		
		if((infiniteSolution)||(row != (col-1))){
			return "Infinite solutions";
		} else if(noSolution) {
			return "No solution";
		} else {
			return "The only solution";
		}
	}

}
