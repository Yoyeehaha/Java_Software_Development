
public class Farm {

	public static void main(String[] args) {
		
		Duck duck = new Duck(true);
        
		//boolean canTheDuckFly = duck.canFly;
		
		boolean canTheDuckFly = duck.getCanFly();
		if(canTheDuckFly == true) {
			System.out.println("The duck can fly");
		}
		
		duck.quack();
		
		String food = "Hamburger";
		String message = duck.eat(food);
		System.out.println(message);
		
		int expectedDistance = 10;
		duck.swim(expectedDistance);
		System.out.println("The expected distance is " + expectedDistance);
	}

}