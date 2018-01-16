package creational.abstract_factory;

public class Client {

	public static void main(String[] args) {
		System.out.println("Ist family of Products: ");
		Creator_X creator = new Creator_X();
		Product_A product = creator.getProductA();
		product.display();
	}
}
