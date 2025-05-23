package versao3;

public class Product {
	
	public String name;
	public double price;
	public int quantity;


	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	// terceira versão incluiu esse método:
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// quantity = 0; -> opcional já que, em Java, int inicia em 0 -- this também é opcional por ñ ter ambiguidade
	}
	
	
	public double totalValueStock() {
		return quantity * price;
	}
	
	
	public void addProducts(int quantityToAdd) {
		quantity += quantityToAdd;
	}
	
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueStock());		
	}
}