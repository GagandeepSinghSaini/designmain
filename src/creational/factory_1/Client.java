package creational.factory_1;

public class Client {

	public static void main(String[] args) {
		Creator creator = new Creator_X();
		Product product = creator.getInstance();
		product.display();
		creator = new Creator_Y();
		product = creator.getInstance();
		product.display();
	}
	
}
