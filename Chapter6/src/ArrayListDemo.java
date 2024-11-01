import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

   
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
	    names.remove(1);
	    System.out.println(names.get(1));

	}

}
