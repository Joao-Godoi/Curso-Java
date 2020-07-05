package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convert(double price, double compra) {
		return (compra * price) * (1.0 + IOF);
	}

}
