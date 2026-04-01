package Polymorphism.BankAccount;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(long accountNumber, double balance) {
		super(accountNumber, balance);
		System.out.println("--------Createad Bank Accound--------");
	}
	
	public void withdraw(long accountNumber,double amount) {
		if(this.accountNumber==accountNumber) {
			if((balance-amount)>=100) {
				balance-=amount;
				System.out.println("Amount withdraw in :"+amount);
			}else {
				System.out.println("Transaction failed:Minimum  balance of 100 mush be maintained!");
			}
		}
		else {
			System.out.println(accountNumber+ " AccountNumber is MisMache");
		}
	}
}
