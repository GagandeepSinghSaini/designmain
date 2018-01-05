package creational.singleton.bill_pugh;

public class MySingleton {

	private MySingleton() {
		// nothing to do
	}
	
	private static class MySingletonHelper() {
		private static MySingleton INSTANCE = new MySingleton();
	}
	
	public static MySingleton getInstance() {
		return MySingletonHelper.INSTANCE;
	}
}
