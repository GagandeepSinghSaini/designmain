package behaviorable.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		String[] stringarray = {"A","B","C"};
		Container container = new ContainerImpl();
		IIterator iter = container.getIterator(stringarray);
		while(iter.hasNext()) {
			String name = (String)iter.next();
	         System.out.println("-> : " + name);
		}
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		iter = container.getIterator(list);
		while(iter.hasNext()) {
			String name = (String)iter.next();
	         System.out.println("-> : " + name);
		}
		
	}
	
	
}
