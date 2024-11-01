import java.util.Scanner;
import java.math.BigDecimal;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = 0, carry = 0;
        
        sc.nextLine();
        
        for (int i = 0;i < n;i++) {
        	
        	String num1 = sc.next();
        	String num2 = sc.next();
        	
        	int num1Integer = Integer.parseInt(num1.substring(0,num1.indexOf(".")));
        	int num2Integer = Integer.parseInt(num2.substring(0,num2.indexOf(".")));
        	int sumInteger = num1Integer + num2Integer;
        	double sumDecimal = 0;
        	String finalnum1Decimal = "", finalnum2Decimal = "";
        	
        	String num1Decimal = num1.substring(num1.indexOf(".") + 1);
        	String num2Decimal = num2.substring(num2.indexOf(".") + 1);
        	
        	if (num1Decimal.length() != num2Decimal.length()) {
        		
        		m = (num1Decimal.length()>num2Decimal.length()) ? (num1Decimal.length() - 1) : (num2Decimal.length() - 1); 
        		while(true) {
        			if((m % (num1Decimal.length()) == 0) && (m % (num2Decimal.length()) == 0)) {
        				break;
        			}
        			m++;
        		}
        		
        		for (int j = 0; j < (m / num1Decimal.length()); j++) {
        		    finalnum1Decimal += num1Decimal;
        		}
        		
        		for (int j = 0; j < (m / num2Decimal.length()); j++) {
        		    finalnum2Decimal += num2Decimal;
        		}
        		
        		sumDecimal = Double.parseDouble(finalnum1Decimal) + Double.parseDouble(finalnum2Decimal);

        		
        		if (sumDecimal % Math.pow(10, Math.floor(Math.log10(sumDecimal)) + 1) == 9) {
        			sumDecimal = 0.0;
        			carry = 1;
        			
        		}

        	    String SumDecimal = Double.toString(sumDecimal);
        	    BigDecimal bd = new BigDecimal(SumDecimal);
    	        SumDecimal = bd.toPlainString();
    	        
    	        
        	    if(SumDecimal.indexOf(".") != -1) {
        	    	SumDecimal = SumDecimal.substring(0, SumDecimal.indexOf("."));
        	    } 
        	    
            	
            	if(carry == 1) {
            		 sumInteger++;
            		 carry = 0;
            		 SumDecimal = SumDecimal.substring(1);
            	}

            	/////
            	if((SumDecimal.length() > finalnum1Decimal.length()) || (SumDecimal.length() > finalnum2Decimal.length())) {
            		sumInteger++;
            		sumDecimal++;
            		SumDecimal = Double.toString(sumDecimal);
            		bd = new BigDecimal(SumDecimal);
         	        SumDecimal = bd.toPlainString();
            		SumDecimal = SumDecimal.substring(1);
            		if(SumDecimal.indexOf(".") != -1) {
            	    	SumDecimal = SumDecimal.substring(0, SumDecimal.indexOf("."));
            	    } 
            	}

            	///////
            	for (int a = 1; a <= SumDecimal.length() / 2; a++) {
                    if (SumDecimal.length() % a == 0) {
                        String substring = SumDecimal.substring(0, a);
                        StringBuilder repeated = new StringBuilder(substring);
                        while (repeated.length() < SumDecimal.length()) {
                            repeated.append(substring);
                        }
                        if (repeated.toString().equals(SumDecimal)) {
                            SumDecimal = substring;
                        }
                    }
                }
            	
            	String finalInteger = Integer.toString(sumInteger);
            	 
            	if(SumDecimal.isEmpty()) {
            		 System.out.println(finalInteger);
            	} else {
            		 System.out.println(finalInteger + "." + SumDecimal);
            	}
        		
        	} else {
        		sumDecimal = Double.parseDouble(num1Decimal) + Double.parseDouble(num2Decimal);
        	    
        		if (sumDecimal % Math.pow(10, Math.floor(Math.log10(sumDecimal)) + 1) == 9) {
        			sumDecimal = 0.0;
        			carry = 1;
        			
        		}
        		
        		String SumDecimal = Double.toString(sumDecimal);
        	    BigDecimal bd = new BigDecimal(SumDecimal);
    	        SumDecimal = bd.toPlainString();
    	        
    	        
        	    if(SumDecimal.indexOf(".") != -1) {
        	    	SumDecimal = SumDecimal.substring(0, SumDecimal.indexOf("."));
        	    } 
        	    
            	
            	if(carry == 1) {
            		 sumInteger++;
            		 carry = 0;
            		 SumDecimal = SumDecimal.substring(1);
            	}

            	/////
            	if((SumDecimal.length() > num1Decimal.length()) || (SumDecimal.length() > num2Decimal.length())) {
            		sumInteger++;
            		sumDecimal++;
            		SumDecimal = Double.toString(sumDecimal);
            		bd = new BigDecimal(SumDecimal);
         	        SumDecimal = bd.toPlainString();
            		SumDecimal = SumDecimal.substring(1);
            		if(SumDecimal.indexOf(".") != -1) {
            	    	SumDecimal = SumDecimal.substring(0, SumDecimal.indexOf("."));
            	    } 
            	}
            	////////////
            	for (int a = 1; a <= SumDecimal.length() / 2; a++) {
                    if (SumDecimal.length() % a == 0) {
                        String substring = SumDecimal.substring(0, a);
                        StringBuilder repeated = new StringBuilder(substring);
                        while (repeated.length() < SumDecimal.length()) {
                            repeated.append(substring);
                        }
                        if (repeated.toString().equals(SumDecimal)) {
                            SumDecimal = substring;
                        }
                    }
                }

            	String finalInteger = Integer.toString(sumInteger);
            	 
            	if(SumDecimal.isEmpty() || sumDecimal == 0.0) {
            		 System.out.println(finalInteger);
            	} else {
            		 System.out.println(finalInteger + "." + SumDecimal);
            	}
        	}
        }
		
		sc.close();
	}

	

}
