package creational.factory;

public class NYPizzaFactory extends PizzaStore {

	Pizza pizza;
	
	@Override
	protected Pizza createPizza(String type) {
		if(("cheese".equals(type))) {
			pizza = new NYCheesePizza();
		}else if("veggie".equals(type)) {
			pizza = new NYVeggiePizza();
		}
		return pizza;
	}

}
