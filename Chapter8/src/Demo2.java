
public class Demo2 {

	public static void main(String[] args) {
		Person2 p = (food)->{
			System.out.println(food);
		};
		p.eat("pizza");
		
		Person2 p2 = food->System.out.println(food);
		p2.eat("hot dog");

	}

}
