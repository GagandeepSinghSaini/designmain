package behaviorable.iterator;

public class ArrayIterator implements IIterator {

	private Object[] names;
	private int index = 0;
	
	public ArrayIterator() {
		System.out.println("We are goimng to iterate array");
	}
	
	public void setCollectionObject(Object names) {
		this.names = (Object[])names;
	}
	
	@Override
	public boolean hasNext() {
		return (names != null && names.length > index);
	}

	@Override
	public Object next() {
		if(names != null) {
			try {
				return names[index++];
			}catch(Exception e) {
				System.out.println("ArrayIterator Exception: "+e);
			}
		}
		return null;
	}

}
