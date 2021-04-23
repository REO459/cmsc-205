package edu.ben.assignments.assignment1;

/**
 * This is my account class
 * 
 * @author omerb
 * @version 1.0
 */
public class Account {
	
	/** 
	 * this is the balance of the account
	 */
	protected double balance;

	/**
	 * Declares the balance for the account
	 * 
	 * @param balance the balance of the account
	 */
	public Account(double balance) {
		// sets the balance
		this.balance = balance;
	}

	/**
	 * Withdraws the funds of the amount
	 * 
	 * @param amount Used to check if there is enough funds in the account
	 */
	public void withdraw(double amount) {
		// checks if there is sufficient funds and then removes the amount given
		if (checkSufficientFunds(amount)) {
			// withdraws from the balance
			balance -= amount;
		} else {
			// throws exception if withdraw is higher than the amount
			throw new ArithmeticException();
		}
	}

	/**
	 * Deposits the amount to the account
	 * 
	 * @param amount The amount you deposited to the balance
	 */
	public void deposit(double amount) {
		// deposit amount to the balance
		balance += amount;
	}

	/**
	 * Checks how much funds is available
	 * 
	 * @param amount Checks if the amount used is less than or equal to the balance
	 * @return (balance >= amount) To see if you have enough to use that amount in your balance
	 */
	private boolean checkSufficientFunds(double amount) {
		// checks if there is sufficient funds
		return (balance >= amount);
	}

	/**
	 * Gets the balance of your account
	 * 
	 * @return balance For the amount of balance you got
	 */
	public double getBalance() {
		// gets the balance
		return balance;
	}

	/**
	 * Sets the amount of balance you got
	 * 
	 * @param balance sets the balance of the account
	 */
	private void setBalance(double balance) {
		// sets the balance
		this.balance = balance;
	}
}

/**
 * This is the savings account
 * 
 * @author omerb
 * @version 1.0
 */
class SavingsAccount extends Account {
	
	// this is the interest rate
	double interestRate;

	/**
	 * This is the savings account
	 *  
	 * @param balance The balance of the account
	 * @param interestRate The interest rate of the account
	 */
	public SavingsAccount(double balance, double interestRate) {
		// sets the saving account and interest rate
		super(balance);
		this.interestRate = interestRate;
	}

	/**
	 * This is where the code gets the interest rate
	 * 
	 * @return interestRate gets the interest rate
	 */
	public double getInterestRate() {
		// gets the interest rate
		return interestRate;
	}

	/**
	 * Sets the interest rate
	 * 
	 * @param interestRate the interest rate for the savings account
	 */
	private void setInterestRate(double interestRate) {
		// sets the interest rate
		this.interestRate = interestRate;
	}

	/**
	 * This is where it accrues the interest
	 */
	public void accrueInterest() {
		// works on the accrue interest equation
		balance *= (1 + interestRate);
	}

}
