
public class Duck {
    private boolean canFly = false;
    
    public boolean getCanFly() {
    	return canFly;
    }
    
    public Duck(boolean canFly) {
    	this.canFly = canFly;
    }
    
    public void quack() {
    	System.out.println("Quack!");
    }
    
    public String eat(String food) {
    	String message = "Thank you the " + food + " is good!";
    	return message;
    }
    
    public void swim(int distance) {
    	distance = distance - 1;
    	System.out.println("The distance of my swimming is " + distance);
    }
}
