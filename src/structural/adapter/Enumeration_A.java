package structural.adapter;

public class Enumeration_A implements IEnumeration {

	@Override
	public void hasNextElements() {
		System.out.println("Enumeration A has more elements or not");
	}

	@Override
	public void nextElement() {
		System.out.println("Enumeration A checks the next elemment");
	}

}
