package creational.singleton.lazy_initialization;

public class MySingleton {

	private static MySingleton instance;
	
	private MySingleton() {
		
	}
	
	public MySingleton getInstance() {
		if(instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
}
