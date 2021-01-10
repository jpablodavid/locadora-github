package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		double diagonal = Math.pow(altura, 2) + Math.pow(largura, 2);
		return Math.sqrt(diagonal);
	}

}
