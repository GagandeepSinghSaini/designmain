package creational.factory;

public class NYCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("--> Prepare NYCheesePizza");
	}

	@Override
	public void bake() {
		System.out.println("--> Bake NYCheesePizza");
	}

	@Override
	public void cut() {
		System.out.println("--> Cut NYCheesePizza");
	}

	@Override
	public void box() {
		System.out.println("--> Box NYCheesePizza");
	}

}
