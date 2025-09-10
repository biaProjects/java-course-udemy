(Conteúdo disponível na aula 79)

## Encapsulamento
É o princípio que consiste em "esconder" detalhes de implementação de uma classe, exponto apenas operações seguras e que mantenham os objetos em um estado consistente.  
_Regra de ouro:_ o objeto deve sempre estar em estado consistente e a própria classe deve garantir isso.  
  
Analogia:  
Aparelhos eletrônicos possuem circuitos internos, operações que o usuário não acessa por questões de segurança, como para evitar um curto circuito, por exemplo. Ou seja, o próprio aparelho "esconde" esses detalhes, fornecendo ao usuário apenas as operações que não irão comprometer o aparelho.  

Outro exemplo muito bom:  
Em uma conta bancária, o usuário não pode, simplesmente, informar... Agora meu saldo será de R$ 200,00. Ele só consegue modificar esse valor através de saques e/ou depósitos.

REGRA GERAL BÁSICA:  
Um objeto NÃO deve expor nenhum atributo (deve usar modificador de acesso *private*).  
Esses atributos devem ser acessados por meio de métodos get e set.  

Padrão para implementação de getters e setters:

```
private String name;
private double price;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

publiic void setPrice(double price) {
	this.price = price;
}
```

Vamos fazer outra refatoração no código de [estoque](https://github.com/biaProjects/java-couse-udemy/tree/master/2%20-%20Object-Oriented%20Programming%20-%20Part1/b%20-%20Constructor-this-overloading-encapsulation/b%20-%20Overloading/Project)? - Essa será a quinta versão do projeto
