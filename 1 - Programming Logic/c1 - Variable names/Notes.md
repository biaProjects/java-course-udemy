(Conteúdo da aula 57 - seção 7)

### Qual é a melhor maneira de declarar variáveis?
Precisamos sempre ter em mente que nosso código está sujeito a futuras alterações (refatorações) e não necessariamente elas serão feitas por nós mesmos. Então, mesmo que dê mais trabalho, precisamos deixar ele o mais claro possível!

As variáveis precisam ter nomes claros, que se auto expliquem.  
Portanto, não faremos por exemplo:
```
int q = sc.nextInt();
```
Para quem fez o código, pode parecer estar claro que q significa quantidade.  
Mas e se outra pessoa for olhar isso? Provavelmente não será possível ou, no mínimo, será difícil a compreensão desse código.  
Por isso, faremos:
```
int quantity = sc.nextInt();
// ou quantidade, se preferir. Mas deixe claro o que ela representa!
```

# 

Outras observações importantes ao declarar uma variável são:
- Não começar com digitos nem _ (underline);
- Não usar acentos;
- Não deixar espaço em branco.

# 

Vamos sempre lembrar:  
- Camel case (lembre de corcovas)  `Exemplo: lastName`, usado em:  
    - Pacotes  
    - Atributos
    - Métodos
    - Variáveis e parâmetros  
- Pascal Case `Exemplo: ProductService`, usado em:
    - Classes
