package structural.decorator;

public class VerticalSB extends Decorator {

	private LCD lcd;
	
	public VerticalSB(LCD lcd) {
		this.lcd = lcd;
	}
	
	@Override
	public void draw() {
		this.lcd.draw();
		System.out.println("Virtual SB ");
		
	}

}
