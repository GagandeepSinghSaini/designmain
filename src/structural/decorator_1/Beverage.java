package structural.decorator_1;

public abstract class Beverage {

	String description = "Un-Known Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();
}
