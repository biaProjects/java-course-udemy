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
		 * se eu digitar name, o programa irá dar preferencia para o local... para me referir ao do objeto, usa...
		 * this (referencia para o proprio objeto, assim como self em python)
		 */
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