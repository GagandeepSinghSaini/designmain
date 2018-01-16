package creational.factory;

public class ChicagoVeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("--> Prepare ChicagoVeggiePizza");
	}

	@Override
	public void bake() {
		System.out.println("--> Bake ChicagoVeggiePizza");
	}

	@Override
	public void cut() {
		System.out.println("--> Cut ChicagoVeggiePizza");
	}

	@Override
	public void box() {
		System.out.println("--> Box ChicagoVeggiePizza");
	}

}
