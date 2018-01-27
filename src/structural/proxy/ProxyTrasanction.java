package structural.proxy;

public class ProxyTrasanction implements ITrasanction {

	private ITrasanction trasanction;
	
	public ProxyTrasanction(double amount) {
		trasanction = new BankTransaction(amount);
	}
	
	@Override
	public void saveMoney() {
		System.out.println("Proxy is calling the trasanction to save money");
		trasanction.saveMoney();
		
	}

	@Override
	public void getOutMoney() {
		System.out.println("Proxy is calling the transaction getting out the money");
		trasanction.getOutMoney();
	}

}
