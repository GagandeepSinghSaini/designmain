package creational.factory_1;

public class Creator_X implements Creator {

	@Override
	public Product getInstance() {
		System.out.println("Creator-X");
		return new Product_A();
	}

}
