package entities;


public class Product {
	
	// encapsulating to get in the default JavaBeans
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// as convention, the getters and setters are included after the constructors
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* we won't create setQuantity because it can't be changed manually...
	* this way, we avoid inconsistencies, keeping the changes just by the methods add and remove
	*/
	
	public int getQuantity() {
		return quantity;
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
