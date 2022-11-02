
public class CheckingAccount extends BankAccount {
	static final double FEE = .15;
	public CheckingAccount(String name, double initialAmount) {
		super(name,initialAmount);
		this.setAccountNumber(this.getAccountNumber() + "-10");
	}
	public boolean withdraw(double amount) {
		return super.withdraw(amount + FEE);
	}
}
