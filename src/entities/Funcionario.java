package entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salario() {
		return salarioBruto - imposto;
	}
	
	public void aumento(double porcento) {
		salarioBruto += (salarioBruto * porcento) / 100;
	}
	
	public String toString() {
		return "Funcionario: " + nome
			 + ", $ " + salario();
	}
	
	

}
