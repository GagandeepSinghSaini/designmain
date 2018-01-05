package creational.singleton.thread_safe;

public class MySingleton {

	private static MySingleton instance;
	
	private MySingleton() {
		
	}
	
	public synchronized MySingleton getInstance() {
		if(instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
	
}
