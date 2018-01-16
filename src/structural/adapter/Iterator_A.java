package structural.adapter;

public class Iterator_A implements IIterator {

	@Override
	public void hasNext() {
		System.out.println("Iteartor-A checks whether it has next element");
	}

	@Override
	public void next() {
		System.out.println("Iteartor-A checks next element");
	}

	@Override
	public void remove() {
		System.out.println("Iteartor-A removes element");
	}

}
