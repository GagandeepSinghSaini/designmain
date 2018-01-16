package creational.abstract_factory;

public class Creator_X implements Creator {

	@Override
	public Product_A getProductA() {
		System.out.println("Product A Creator");
		return new ProductA_2();
	}

	@Override
	public Product_B getProductB() {
		System.out.println("Product B Creator");
		return new ProductB_1();
	}

}
