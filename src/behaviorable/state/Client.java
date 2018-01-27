package behaviorable.state;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		TrafficSystem tSystem = new TrafficSystem();
		int i=10;
		while(i > 0 ) {
			tSystem.displayState();
			if(tSystem.getCurrentState() instanceof YellowState) {
				Thread.sleep(1000);
			}else {
				Thread.sleep(2000);
			}
			tSystem.changeState();
			i--;
		}
	}
	
}
