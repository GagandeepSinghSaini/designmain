package behaviorable.template;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}

	public void buildFoundation() {
		System.out.println("HouseTemplate.buildFoundation()");
	}

	public abstract void buildPillars();

	public abstract void buildWalls();

	public void buildWindows() {
		System.out.println("HouseTemplate.buildWindows()");
	}
}
