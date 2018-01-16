package behaviorable.template;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("GlassHouse: buildPillars()");
	}

	@Override
	public void buildWalls() {
		System.out.println("GlassHouse: buildWalls()");
	}

}
