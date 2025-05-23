package versao1;

public class Product {
	
	public String name;
	public double price;
	public int quantity;

	
	public double totalValueStock() {
		return quantity * price;
	}
	
	
	public void addProducts(int quantityToAdd) {
		quantity += quantityToAdd;
	}
	
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	// segunda versão:
	public String toString() {
		return name + 
				", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueStock());		
	}
}