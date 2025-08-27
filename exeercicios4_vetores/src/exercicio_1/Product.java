package exercicio_1;

public class Product {

	private String name;
	private double price;
	
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String get_name() {
		return name;
	}
	
	public void set_name(String name) {
		name = this.name;
	}
	
	public double get_price() {
		return price;
	}
	
	public void set_price(double price) {
		price = this.price;
	}
}
