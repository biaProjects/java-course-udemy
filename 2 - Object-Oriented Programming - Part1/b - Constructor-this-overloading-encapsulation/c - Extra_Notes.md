Resumo desenvolvido por [Beatriz](https://www.linkedin.com/in/bia-almeida-dev/)  

## Construtores...
Para explicar, usaremos a classe:

```
public class  Carro {
	String marca;
	String modelo;
	Int ano;
	Int portas;
}
```

Para declararmos o construtor dela... temos as seguintes opções:  

### 1. Padrão
O padrão caso seja *apenas ele, não é necessário declarar*...    Mas, caso vá incluir outros e queria incluir ele também, faça assim:

```
public Carro() {
}
```

Na classe *Programa* iremos instanciar o objeto da seguinte forma:

```
Carro car = new Carro();

Carro.marca = "Dodge";
Carro.modelo = "Challenger";
Carro.modelo = 2018;
Carro.portas = 5;
```

---

### 2. Personalizado
Podemos criar nosso próprio construtor, da seguinte forma:

```
public Carro(String marca, String modelo, int ano, int portas){
	this.marca = marca
	this.modelo = modelo
	this.ano = ano
	this.portas = portas
}
``` 

Essa forma é útil para obrigar a instanciação do objeto com os argumentos corretamente.  

Na classe programa, a instanciação ocorrerá assim:

```
Carro car = new Carro("Dodge", "Challenger", 2018, 5);
```

---

### 3. Com sobrecarga
Caso vá criar um construtor extra, por exemplo, para criar o padrão de portas em 5, mas também permitir a declaração disso, fazemos o seguinte:  

Mantemos o segundo constutor e criamos um logo abaixo, sem incluir `portas` como parâmetro.  
Ou seja:

```
// mantemos o segundo:
public Carro(String marca, String modelo, int ano, int portas){
	this.marca = marca
	this.modelo = modelo
	this.ano = ano
	this.portas = portas
}

// e acrescentamos o próximo:
public Carro(String marca, String modelo, int ano){
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	portas = 5;
}
```

Dessa forma, na classe programa, será possivel instanciar assim...

```
Carro car = new Carro("Dodge", "Challenger", 2018, 5);
```

Ou assim:

```
Carro car = new Carro("Dodge", "Challenger", 2018);
```
