(Conteúdo disponível na aula 67 e 68)

Nosso projeto, agora, será um programa que irá ler os dados de um produto em estoque (terá nome, preço e quantidade em estoque). Depois:  
1. Mostre os dados do produto (nome, preço, quantidade no estoque e valor total em estoque)
2. Realize a entrada no estoque e mostre os dados do produto
3. Realize uma saída no estoque e mostre os dados do produto

Para realização desse projeto, iremos criar a seguinte classe:
| product                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- |
| - Name : string <br> - Price : double <br> - Quantity : int                                                        |
| + TotalValueStock() : double <br> + AddProducts(quantitu : int) : void <br> + RemoveProduct(quantity : int) : void |

Exemplo:
> Enter product data: 
> Name: *TV* 
> Price: *900.00* 
> Quantity in stock: *10*
> 
> Product data: TV, $ 900.00, 10 units, Total: $ 9000.00 
> 
> Enter the number of products to be added in stock: ==5 ==
> 
> Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00 
> 
> Enter the number of products to be removed from stock: ==3== 
> 
> Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00


### toString
Teoria:  
Toda classe em java é uma subclasse da classe Object.  
Essa classe possui os métodos:  
- getClass -> retorna o tipo do objeto  
- equals -> compara se o objeto é igual ao outro  
- hashCode -> retorna um código hash do objeto  
- toString -> converte o objeto para string 

Essas operações sempre estão disponíveis para a classe.

O método `toString` serve para declarar como queremos que aquele objeto seja apresentado.
