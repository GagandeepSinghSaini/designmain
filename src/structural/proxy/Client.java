package structural.proxy;

public class Client {

	public static void main(String[] args) {
		double amount = 100.90;
		ITrasanction myTransaction = new ProxyTrasanction(amount);
		myTransaction.saveMoney();
		
		amount = 50.20;
		myTransaction = new ProxyTrasanction(amount);
		myTransaction.getOutMoney();
		
		
	}
	
}
