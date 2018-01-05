package structural.decorator_1;

public class Beverage_A extends Beverage {

	public Beverage_A() {
		description = "Beverage-A";
	}
	
	@Override
	public double getCost() {
		return 1.99 ;
	}

}
