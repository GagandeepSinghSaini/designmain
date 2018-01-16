package structural.decorator;

public class HorizontalSB extends Decorator {

	private LCD lcd;
	
	public HorizontalSB(LCD lcd) {
		this.lcd = lcd;
	}
	
	@Override
	public void draw() {
        this.lcd.draw();
		System.out.println("Horizontal SB ");
		
	}

}
