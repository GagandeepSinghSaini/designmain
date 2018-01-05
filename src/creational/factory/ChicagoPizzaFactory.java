package creational.factory;

public class ChicagoPizzaFactory extends PizzaStore{

	Pizza pizza;
	 
	@Override
	protected Pizza createPizza(String type) {
		if(("cheese".equals(type))) {
			pizza = new ChicagoCheesePizza();
		}else if("veggie".equals(type)) {
			pizza = new ChicagoVeggiePizza();
		}
		return pizza;
	}

}
