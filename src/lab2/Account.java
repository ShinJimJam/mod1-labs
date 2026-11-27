package lab2;

public class Account {
	
	private int id;
	private String owner;
	private double balance;
	
	
//Constructor	
	public Account(int id, String owner, double balance) {
	    this.id = id;
	    this.owner = owner;
	    this.balance = balance;
	}

//Deposit money	
	public void Deposit(double amount) {
	    if (amount > 0) {
	        balance = balance + amount;
	    } else {
	        System.out.println("Deposit amount must be greater than zero.");
	    }
	}
	
//Withdraw money	
	public void Withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	        balance = balance - amount;
	    } else {
	        System.out.println("Insufficient funds or invalid withdrawal amount.");
	    }
	}
	
	public void AddInterest() {
		balance = balance * 1.025;
	}
	
//Return account details	
	public String getDetails() {
	    return String.format("Account ID: %d, Owner: %s, Balance: £%.2f", id, owner, balance);
	}
}