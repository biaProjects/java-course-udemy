package entities;

public class Conta {
	
	public static final double TAXA = 5.00;
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	
	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nome) {
		nome = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		saldo = saldo - valorSaque - TAXA;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
}