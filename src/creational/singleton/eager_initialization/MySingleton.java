package creational.singleton.eager_initialization;

public class MySingleton {

	private static final MySingleton instance = new MySingleton();
	
	private MySingleton() {
		
	}
	
	public MySingleton getInstance() {
		return instance;
	}
	
}
