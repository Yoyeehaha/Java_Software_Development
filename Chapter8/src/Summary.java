import java.util.*;
import java.util.function.Consumer;

public class Summary {

	public static void main(String[] args) {

        List<String> strList = Arrays.asList("A", "B", "C");
        
        //Anonymous class (匿名類別)
        strList.forEach(new Consumer<String>(){
        	@Override
        	public void accept(String s) {
        		System.out.println(s);
        	}
        });
        
        //Lambda expression
        strList.forEach(s -> System.out.println(s));
        
        //Method reference
        strList.forEach(System.out::println);
        
        //Method reference(靜態)
		strList.forEach(Summary ::static_printList);
		
		//Method reference(實例)
		Summary summary = new Summary();
		strList.forEach(summary::instance_printList);
	}
	
	private static void static_printList(String s) {
		System.out.println(s);
	}
	
	private void instance_printList(String s) {
		System.out.println(s);
	}

}
