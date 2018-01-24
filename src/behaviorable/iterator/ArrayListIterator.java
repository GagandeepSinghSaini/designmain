package behaviorable.iterator;

import java.util.List;

public class ArrayListIterator implements IIterator {

	private List<String> names;
	private int index = 0;
	
	public ArrayListIterator() {
		System.out.println("We are going to iterate ArrayList");
	}
	
	public void setCollectionObject(Object names) {
		this.names = (List<String>)names;
	}
	
	@Override
	public boolean hasNext() {
		return (names != null && names.size() > index);
	}

	@Override
	public Object next() {
		if(names != null) {
			try {
				return names.get(index++);
			}catch(Exception e) {
				System.out.println("ArrayListIterator Exception: "+e);
			}
		}
		return null;
	}

}
