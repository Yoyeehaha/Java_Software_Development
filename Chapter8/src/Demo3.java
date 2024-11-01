import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo3 {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("DHaka", "New York", "London");
		
		Consumer<List<String>> upperCaseConsumer = list->{
			for(int i = 0;i < list.size();i++) {
				list.set(i, list.get(i).toUpperCase());
			    System.out.println(list.get(i));
			}
			
		};
		
		upperCaseConsumer.accept(cities);
		
		

	}

}
