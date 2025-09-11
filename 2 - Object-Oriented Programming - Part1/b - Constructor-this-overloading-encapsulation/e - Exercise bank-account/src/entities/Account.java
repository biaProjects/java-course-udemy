package entities;

public class Account {
	
	public final double TAX = 5.00;
	
	private int number;
	private String holdersName;
	private double balance;
	
	
	public Account(int number, String holdersName, double initialDeposit) {
		this.number = number;
		this.holdersName = holdersName;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holdersName) {
		this.number = number;
		this.holdersName = holdersName;
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public String getHoldersName() {
		return holdersName;
	}
	
	public void setHoldersName(String name) {
		name = holdersName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount - TAX;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holdersName
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}