package structural.decorator_1;

public class Decorator_X extends CondimentDecorator {

	Beverage beverage;
	
	public Decorator_X(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Decorator_X";
	}

	@Override
	public double getCost() {
		return 1.00 + beverage.getCost();
	}

}
