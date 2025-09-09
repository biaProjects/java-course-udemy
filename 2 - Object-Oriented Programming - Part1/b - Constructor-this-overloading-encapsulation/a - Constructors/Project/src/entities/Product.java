package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	/* Let's add a constructor with name, price and quantity.
	Usually, we include the constructors after the attributes
	*/

	
	public Product(String name, double price, int quantity) {
		// the name of the attributes can be different, but as a convention, we use the same
		
		/* now we need to link the parameters with the attributes of the class
		 * if we type name, the program will have preference to the local... to make it about the class, use:
		 * this
		*/
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
		return name +
			", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueStock());
	}
}