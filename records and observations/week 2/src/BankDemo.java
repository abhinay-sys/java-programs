class Account {
	int accountNumber;
	float balance;
	String accounttype;

	void Deposit(float amount) {
		balance = balance + amount;
	}

	void Withdraw(float amount) {
		if (balance >= amount)
			balance = balance - amount;
		else
			System.out.println("Insuffiecent Amount");
	}
}

class SavingsAccount extends Account {
	float interestRate;

	void CalculateInterest(int time) {
		float Simpleinterest = (balance * interestRate * time) / 100;
		balance = balance + Simpleinterest;
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account type : " + accounttype);
		System.out.println("Balance : " + balance);
		System.out.println("Simple Interest : " + Simpleinterest);
	}
}

class CurrentAccount extends Account {
	float overdraftLimit;

	void transfer(float amount) {
		if (balance + overdraftLimit >= amount) {
			balance = balance - amount;
			System.out.println("Account Number : " + accountNumber);
			System.out.println("Account type : " + accounttype);
			System.out.println("Transfer amount : " + amount);
			System.out.println("Current Account Balance : " + balance);
		} else {
			System.out.println("overdraft Limit Exceeded");
		}
	}
}

public class BankDemo {
	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount();
		s1.accountNumber = 546825370;
		s1.balance = 10000;
		s1.accounttype = "Savings";
		s1.interestRate = 5;
		s1.CalculateInterest(3);

		System.out.println();

		CurrentAccount c1 = new CurrentAccount();
		c1.accountNumber = 128973968;
		c1.balance = 20000;
		c1.accounttype = "Current";
		c1.overdraftLimit = 10000;
		c1.transfer(18000);
	}
}