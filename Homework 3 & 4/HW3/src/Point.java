public class Point {
	
	private int vertical = 0;
	private int horizontal = 0;
	public void Set(int vertical, int horizontal) {
		this.vertical = vertical;
		this.horizontal = horizontal;
	}
	
	public void Move(int x, int y) {
		vertical += x;
		horizontal += y;
	}
	
	public void Rotate() {
		int temp = vertical;
		vertical = horizontal;
		horizontal = -temp;
	}
	
	public int RetreiveVertical() {
		return vertical;	
	}
	
	public int RetreiveHorizontal() {
		return horizontal;	
	}
	
	public int CalculateManhattanDistance(Point other) {
		return Math.abs(vertical - other.vertical) + Math.abs(horizontal - other.horizontal);
	}
	
	public double CalculateChebyshevDistance(Point other) {
        return Math.max(Math.abs(vertical - other.vertical), Math.abs(horizontal - other.horizontal));
    }
	
	
}
