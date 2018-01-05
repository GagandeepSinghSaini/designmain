package structural.decorator;

public class Client {

	public static void main(String[] args) {
		LCD myLCD = new Border(new VerticalSB(new Window()));
		myLCD.draw();
	}
}
