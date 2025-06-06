
public class lab1 {
    
	public static void main(String[] args) {
		String aString = "abc";
		
		System.out.println("String output:");
		System.out.println("START1234567890");
		System.out.printf("START%sEND %n", aString);
		System.out.printf("START%4sEND %n", aString);
		System.out.printf("START%2sEND %n", aString);
		System.out.println();
		
		char oneCharacter = 'Z';
		
		System.out.println("Character output:");
		System.out.println("START1234567890");
		System.out.printf("START%cEND %n", oneCharacter);
		System.out.printf("START%4cEND %n", oneCharacter);
		System.out.println();
		
		
		double d = 12345.123456789;
		
		System.out.println("String output:");
		System.out.println("START1234567890");
		System.out.printf("START%fEND %n", d);  //12345.123457
		System.out.printf("START%.4fEND %n", d);  //12345.1235
		System.out.printf("START%.2fEND %n", d); //12345.12
		System.out.printf("START%12.4fEND %n", d); //  12345.1235
		System.out.printf("START%eEND %n", d);  //1.234512e+04
		System.out.printf("START%12.5eEND %n", d);  //1.23451e+04
	}
}
