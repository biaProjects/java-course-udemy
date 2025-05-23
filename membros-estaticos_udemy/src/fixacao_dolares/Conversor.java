package fixacao_dolares;

public class Conversor {
	
	public static final double IOF = 0.06;
	
	public static final double conversor(double price, double amount) {
		return price * amount + (price * amount * IOF);
	}
}