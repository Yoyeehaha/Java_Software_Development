
public class Demo {

	public static void main(String[] args) {
		Person p = new Person() {
			public void eat(String food) {
				System.out.println(food);
			}
			
			public void run() {
				System.out.println("running");
			}
		};

		p.eat("pizza");
	}

}
