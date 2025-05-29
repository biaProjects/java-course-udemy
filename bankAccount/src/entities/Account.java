package entities;

public class Account {
	
	public final double TAX = 5.00;
	
	private int number;
	private String holdersName;
	private double balance;
	
	
	public Account(int numberAccount, String holdersName, double initialDeposit) {
		this.number = numberAccount;
		this.holdersName = holdersName;
		deposit(initialDeposit);
	}
	
	public Account(int numeroConta, String holdersName) {
		this.number = numeroConta;
		this.holdersName = holdersName;
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public String getHoldersName() {
		return holdersName;
	}
	
	public void setHoldersName(String nome) {
		nome = holdersName;
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