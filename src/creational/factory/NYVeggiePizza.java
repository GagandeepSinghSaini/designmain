package creational.factory;

public class NYVeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("--> Prepare NYVeggiePizza");
	}

	@Override
	public void bake() {
		System.out.println("--> Bake NYVeggiePizza");
	}

	@Override
	public void cut() {
		System.out.println("--> Cut NYVeggiePizza");
	}

	@Override
	public void box() {
		System.out.println("--> Box NYVeggiePizza");
	}

}
