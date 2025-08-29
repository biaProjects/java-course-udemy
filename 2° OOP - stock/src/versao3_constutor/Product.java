package versao3_constutor;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	/* vamos incluir um construtor para que name, price e quantity seja "obrigatorio" na declaração
	geralmente, os construtores são incluidos em baixo dos atributos
	*/
	
	public Product(String name, double price, int quantity) {
		// os nomes dos atributos podem ser diferentes mas, por convenção, costuma-se usar os mesmos
		/* agora vamos atribuir cada item do parametro para cada item do objeto
		* para remover ambiguidade usamos... this
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