package structural.flyweight;

public class Client {

	public static final String colors[] = { "Red", "Green", "Blue" };
	
	public static void main(String[] args) {
		for(int count = 0; count<10; count++ ) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
			System.out.println("----------------------------------------------");
		}
	}
	private static String getRandomColor() {
	    return colors[(int)(Math.random()*colors.length)];
	}
	private static int getRandomX() {
	    return (int)(Math.random()*100 );
	}
	private static int getRandomY() {
	    return (int)(Math.random()*100);
	}
}
