package creational.factory;

public class Client {

	public static void main(String[] args) {
		PizzaStore NYfactory = new NYPizzaFactory();
		PizzaStore ChicagoFactory = new ChicagoPizzaFactory();
		NYfactory.orderPizza("cheese");
		ChicagoFactory.orderPizza("veggie"); 
		
	}
	
}
