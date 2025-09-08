(Conteúdo disponível nas aulas 64 e 65)  

### Sem POO
Primeiro, vamos fazer um programa sem utilizar a Programação Orientada a Objetos (POO).  
O programa irá ler as medidas dos lados de 2 triângulos e, em seguida, mostrará o valor da área dos 2 triângulos e informará qual possui maior área.  
Lembrando que a fórmula para calcular área de triângulo, a partir de seus lados (seguindo a fórmula de Heron) é:  

_`area = √p(p-a)(p-b)(p-c)`_  

Onde:  

_`p = (a+b+c) / 2`_    

Exemplo de funcionamento do programa:  
> Enter the measure of triangle x:  
> *3.00*  
> *4.00*  
> *5.00*  
> Enter the measure of triangle Y:  
> *7.50*  
> *4.50*  
> *4.02*  
> Triangle X area: 6.0000  
> Triangle Y area: 7.5638  
> Larger area: Y  


### Um pouco de teoria
Uma classe...    
- É um tipo estruturado que pode conter
    - Atributos
    - Métodos
- Pode prover recursos como:
    - Construtores
    - Sobrecarga
    - Encapsulamento
    - Herança
    - Polimorfismo
    (Veremos um pouco disso na próxima seção)
- Exemplos:
	- entidades: Produto, Cliente, Triangulo
	- Serviços: ProdutoService, ClienteService, EmailService, StorageService
	- Controladores: ProdutoController, ClienteController
	- Utilitários: Calculadora, Compactador
	- Outros (views, repositórios, gerenciadores, etc.)


### Representando o triângulo
Agora, vamos refatorar nosso código criando uma classe para melhor representar o triângulo.  
Essa classe incluirá 3 atributos.

Para isso, precisaremos mudar um pouco da nossa estrutura também...  
Dentro de `src` iremos criar 2 classes...  
1. Para desenvolver o bloco principal de códigos:  
    - package: application  
    - class: Program
2. Para representar o triângulo:  
    - package: entities  
    - class: Triangle


### Alocação de memória
- Stack = área onde são armazenadas as variáveis estáticas  
    (ex: areaX, areaY, p, y, x)  

- Heap = areá onde são criados objedos dinamicos durante a execução  
	A | B | C   
	(x vira uma referencia a algo que está no heap, formando uma alocação dinâmica de memória)

Ou seja:  
Classe é a definição do tipo  
Objeto é a instância da classe
