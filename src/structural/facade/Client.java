package structural.facade;

public class Client {

	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawCircle();
		maker.drawRectangle();
		maker.drawSquare();
	}
}
