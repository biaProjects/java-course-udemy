(Conteúdo disponível na aula 76)

### Construtores
Construtor é uma operação especial da classe que será executada no momento da instanciação do objeto, ou seja, no momento que incluimos `new`.  

Eles são usados para...  
- Iniciar valores dos atributos
- Permitir ou obrigar que o objeto receba dados (injeção de depência).  

Se um construtor customizado não for especificado, então será o padrão da classe (Something some = new Something)  

É possível especificar mais de um construtor na mesma classe (_sobrecarga_, veremos isso algumas aulas adiante)

Para exemplificar, vamos usar o exercício de [estoque](https://github.com/biaProjects/java-couse-udemy/tree/master/2%20-%20Object-Oriented%20Programming%20-%20Part1/a%20-%20Introduction%20to%20OOP/b%20-%20Project%202%20-%20Stock) que realizamos anteriormente, fazendo uma refatoração nele (nosso segundo oop do tópico anterior).  

Anteriormente, nas primeiras resoluções desse estoque, executavamoos o comando `product = new Product();`, instanciando um produto com atributos vazios.  
Ou seja, se imprimirmos o objeto logo após instânciá-lo, ele será como...  
> name = null  
> price = 0.0  
> quantity = 0  

Porém, concorda que não faz sentido termos um produto sem nome, ou que não possua preço?  

Com o intuito de evitar isso, é possível tornar "obrigatório" esses atributos ao instanciar o objeto.  
