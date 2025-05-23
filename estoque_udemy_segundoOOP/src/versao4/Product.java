package versao4;

public class Product {

	// encapsulando os argumentos para encaixar no padrão JavaBeans
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

	// por convenção, os métodos getters e setters são incluidos abaixo dos construtores	
	
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
	
	/* não criaremos setQuantity pois não é algo que pode ser alterado manualmente...
	* assim, evitamos inconsistencias na classe, mantendo a alteração apenas nos métodos add e remove
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