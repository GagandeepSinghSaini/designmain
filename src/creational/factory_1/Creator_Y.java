package creational.factory_1;

public class Creator_Y implements Creator {

	@Override
	public Product getInstance() {
		System.out.println("Creator-Y");
		return new Product_B();
	}

}
