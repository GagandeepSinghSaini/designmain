package structural.adapter;

public class Client {

	public static void main(String[] args) {
		System.out.println("------STARTS------");
		
		System.out.println(" <<<< Iterator >>>>");
		IIterator iterator = new Iterator_A();
		iterator.hasNext();
		iterator.next();
		iterator.remove();
		
		System.out.println(" <<<< Enumeration >>>>");
		IEnumeration enumeration = new Enumeration_A();
		enumeration.hasNextElements();
		enumeration.nextElement();
		
		System.out.println(" <<<< Enumeration to Iterator >>>>");
		IteratorAdapter adapter = new IteratorAdapter(enumeration);
		adapter.hasNext();
		adapter.next();
		adapter.remove();
		
		
	}
	
}
