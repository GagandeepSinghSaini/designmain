package structural.adapter;

public class IteratorAdapter implements IIterator {

	private IEnumeration enumeration;
	
	public IteratorAdapter(IEnumeration enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public void hasNext() {
		enumeration.hasNextElements();
	}

	@Override
	public void next() {
		enumeration.nextElement();
	}

	@Override
	public void remove() {
		System.out.println("OOPS! Undefined Request for enumeration");
	}

}
