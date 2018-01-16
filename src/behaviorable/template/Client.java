package behaviorable.template;

public class Client {

	public static void main(String[] args) {
		HouseTemplate ht = new WoodenHouse();
		ht.buildHouse();
		
		ht = new GlassHouse();
		ht.buildHouse();
	}
	
}
