package creational.singleton;

import creational.singleton.double_checked.*;

public class Client {

	public static void main(String[] args) {
		System.out.println("Start");
		MySingleton instance = MySingleton.getInstace();
		instance = MySingleton.getInstace();
		instance = MySingleton.getInstace();
		System.out.println("End");
		
		creational.singleton._enum.MySingleton instance_enum1 = creational.singleton._enum.MySingleton.INSTANCE;
		System.out.println("ENUM OBject: "+instance_enum1.hashCode());
		instance_enum1.doSomething();
		creational.singleton._enum.MySingleton instance_enum2 = creational.singleton._enum.MySingleton.INSTANCE;
		System.out.println("ENUM OBject: "+instance_enum2.hashCode());
		instance_enum2.doSomething();
	}
	
}
