package structural.proxy;

public class BankTransaction implements ITrasanction {

	double amount;
	
	public BankTransaction(double amount) {
		this.amount = amount;
	}
	
	@Override
	public void saveMoney() {
		System.out.println("SAVING AMOUNT: "+amount+" in your account");
		
	}

	@Override
	public void getOutMoney() {
		System.out.println("GETTING AMOUNT: "+amount+" from your account");
	}

}
