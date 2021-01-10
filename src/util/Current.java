package util;

public class Current {

	public double dolar;
	public final static double IMPOSTO = 100/6;
	
	public static double valorReais(double dolar, double quantidade) {
		double valor = dolar * quantidade;
		return valor *= IMPOSTO;
	} 
	
}
