
public class SavingsAccount extends BankAccount {
	private double rate = .025;
	public int savingsNumber = 0; //should this be private?
	private String accountNumber;
	public SavingsAccount(String name, double initialBalance) {
		super(name,initialBalance);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest() {
		 super.deposit(super.getBalance() * (this.rate / 12.0));
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public SavingsAccount(SavingsAccount copee, double initialBalance) {
		super(copee, initialBalance);
		this.savingsNumber = copee.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}
