package behaviorable.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("WoodenHouse: buildPillars()");
	}

	@Override
	public void buildWalls() {
		System.out.println("WoodenHouse: buildWalls()");
	}

}
