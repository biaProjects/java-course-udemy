package versao1;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueStock() {
		return quantity * price;
	}
	
	public void addProducts(int quantityToAdd) {
		/* poderia declarar o quantityToAdd como quantity também
		para remover a ambiguidade só precisaria fazer...
		this.quantity (da classe) += quantity
		(proximo metodo esta assim)
		*/
		quantity += quantityToAdd;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}