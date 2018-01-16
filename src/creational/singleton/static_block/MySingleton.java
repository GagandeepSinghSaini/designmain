package creational.singleton.static_block;

public class MySingleton {

	private static MySingleton instance;
	
	static {
		try {
			instance = new MySingleton();
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
	public MySingleton getInstance() {
		return instance;
	}
	
}
