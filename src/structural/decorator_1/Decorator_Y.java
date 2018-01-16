package structural.decorator_1;

public class Decorator_Y extends CondimentDecorator {

	Beverage beverage;
	
	public Decorator_Y(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Decorator_Y";
	}

	@Override
	public double getCost() {
		return 2 + beverage.getCost();
	}

}
