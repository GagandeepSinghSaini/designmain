package structural.decorator;

public class Border extends Decorator {

	private LCD lcd;
	
	public Border(LCD lcd) {
		this.lcd = lcd;
	}
	
	@Override
	public void draw() {
		this.lcd.draw();
		System.out.println("BORDER ");
	}

}
