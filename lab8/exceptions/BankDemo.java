package exceptions;

public class BankDemo {
public static void main(String args[]) {
	checking_account a1 = new checking_account(101);
	System.out.println("Depositing 500");
	a1.deposit(500.00);
	try {
		System.out.println("Withdrawing 100");
		a1.withdraw(100.00);
		System.out.println("Withdrawing 600");
		a1.withdraw(600.00);
	}
	catch(InsufficientFundsException e){
		System.out.println("Sorry! You dont have enough funds in your account. You are short $" + e.getamount());
	}
}
}
