package structural.decorator_1;

public class Client {

	 public static void main(String[] args) {
		Beverage item1 = new Beverage_A();
		System.out.println("ITEM-1: ["+item1.getDescription()+", Cost: "+item1.getCost()+"]");
		
		Beverage item2 = new Beverage_B();
		System.out.println("ITEM-1: ["+item2.getDescription()+", Cost: "+item2.getCost()+"]");
		
		Beverage addOnItem = new Decorator_X(item1);
		System.out.println("Order-1: ["+addOnItem.getDescription()+", Cost: "+addOnItem.getCost()+"]");
		
		addOnItem = new Decorator_Y(item2);
		System.out.println("Order-2: ["+addOnItem.getDescription()+", Cost: "+addOnItem.getCost()+"]");
		
		addOnItem = new Decorator_X(new Decorator_Y(item2));
		System.out.println("Order-3: ["+addOnItem.getDescription()+", Cost: "+addOnItem.getCost()+"]");
		
		addOnItem = new Decorator_X(new Decorator_Y(item1));
		System.out.println("Order-4: ["+addOnItem.getDescription()+", Cost: "+addOnItem.getCost()+"]");
		
	}
}
