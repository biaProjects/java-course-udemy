package entities;

public class Triangle {

	public double sideA;
	public double sideB;
	public double sideC;
	
	
	/* Vamos definir o metodo para calcular a area
	Para isso, vamos...
	1.Declarar uma função publica (que podera ser usada em outro arquivo)
	2.Declarar o tipo de valor que a função ira retornar (se fosse o caso de nao retornar nada seria "void")
	3.O nome da funcao
	4.Depois, dentro do parenteses, podemos, ou nao, declarar os parametros que ela devera receber
	
	Nesse caso, ela precisa receber algum dado que nao esta contido na classe?
	Nao
	Entao nao e necessario acrescentar nenhum parametro
	*/
	
	public double area() {
		double p = (sideA + sideB + sideC) / 2.0;
		double result = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		
		return result;
	}
}
