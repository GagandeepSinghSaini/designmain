package creational.singleton._enum;

public enum MySingleton {
	INSTANCE;
	
	public static void doSomething() {
		System.out.println("Implemented Singleton with ENUM");
	}
}
