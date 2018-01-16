package creational.singleton.double_checked;

public class MySingleton {

	private static MySingleton instance;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstace() {
		if(instance == null) {
			synchronized (MySingleton.class) {
				if(instance == null) {
					instance = new MySingleton();
					System.out.println("Singleton Instance has been created");
				}
			}
		}
		return instance;
	}
}
