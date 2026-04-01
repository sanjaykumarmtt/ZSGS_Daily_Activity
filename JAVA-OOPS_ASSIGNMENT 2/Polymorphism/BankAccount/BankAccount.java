package Polymorphism.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Gatherer.Integrator;

public class BankAccount {

	protected long accountNumber;
	protected double balance;

	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(long accountNumber, double amount) {
		if (this.accountNumber == accountNumber) {
			balance += amount;
			System.out.println("Amount Deptade in :" + amount);
		} else {
			System.out.println(accountNumber + " AccountNumber is MisMache");
		}
		
	}

	public void withdraw(long accountNumber, double amount) {

		if (this.accountNumber == accountNumber) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Amount withdraw in :" + amount);
			} else {
				System.out.println("Insufficient balance!");
			}
		} else {
			System.out.println(accountNumber + " AccountNumber is MisMache");
		}
	}

	public void ShowBalance(long accountNumber) {
		if (this.accountNumber == accountNumber) {
			System.out.println("Your Avlable Balance is " + balance);
		} else {
			System.out.println(accountNumber + " AccountNumber is MisMache");
		}
	}
}