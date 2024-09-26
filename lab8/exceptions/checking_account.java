package exceptions;

public class checking_account {
	public double balance;
	public int number;
	public checking_account(int number) {
		this.number=number;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			double needs= amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
}
