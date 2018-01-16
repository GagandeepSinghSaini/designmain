package behaviorable.strategy;

public abstract class Duck {

	IFlyBehavior fly;
	IQuackBehavior quack;
	
	public void setFlyBehavior(IFlyBehavior fly) {
		this.fly = fly;
	}
	
	public void setQuackBehavior(IQuackBehavior quack) {
		this.quack = quack;
	}
	

	public abstract void display();
	
	
}
