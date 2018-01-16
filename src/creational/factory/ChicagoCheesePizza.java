package creational.factory;

public class ChicagoCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("--> Prepare ChicagoCheesePizza");
	}

	@Override
	public void bake() {
		System.out.println("--> Bake ChicagoCheesePizza");
	}

	@Override
	public void cut() {
		System.out.println("--> Cut ChicagoCheesePizza");
	}

	@Override
	public void box() {
		System.out.println("--> Box ChicagoCheesePizza");
	}

}
