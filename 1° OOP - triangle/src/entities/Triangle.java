package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	/* Vamos definir o método para calcular a area
	 Para isso, vamos declarar uma função publica (que podera ser usada em outro arquivo)
	 Depois declaramos o tipo de valor que a função ira retornar (se fosse o caso de nao retornar nada seria "void"
	 O nome da funcao
	 Depois, dentro do parenteses, podemos, ou nao, declarar os parametros que ela devera receber
	 Nesse caso, ela precisa receber algum dado que nao esta contido na classe?
	 Nao
	 Entao nao e necessario acrescentar nenhum parametro
	 */
	
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return result;
	}
}