package structural.decorator_1;

public class Beverage_B extends Beverage {

	public Beverage_B() {
		description = "Beverage-B";
	}
	
	@Override
	public double getCost() {
		return 2.99;
	}

}
