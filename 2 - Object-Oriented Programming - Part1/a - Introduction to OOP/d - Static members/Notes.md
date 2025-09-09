(Conteúdo disponível nas aulas 71 e 72)

### Membros estáticos
Uma classe possui seus membros (os atributos e os métodos).  

Os membros estáticos (também chamados de membros de clase em oposição a membros de intância), não precisam de objetos para serem chamados.  
Algumas aplicações comuns são de classes utilitárias (por exemplo: Math.sqrt()... math é uma classe) e declaração de constantes.  

Para exemplificar e facilitar a compreensão, vamos desenvolver um programa de 3 maneiras diferentes:

Enunciado:
Faça um programa que leia um valor numérico qualquer e mostre o valor de uma circunferência e volume para um raio daquele valor.  
Informe, tambpem, o valor de PI com 2 casa decimais.

Exemplo:
> Informe o raio: *3.0*  
> Circunferencia: 18.85  
> Volume: 113.10  
> Valor de PI: 3.14  

As variações do programa serão:

1. tudo junto, na mesma classe  
    Porémm...  
    Em uma mesma classe, não é possível chamar um metodo não estático em um estático.  
    _Como assim?_  
    Você não pode chamar um método orientado a objetos em um método não orientado a objetos, por isso a necessidade e obrigatoriedade de colocar o "static" em tudo nesse caso.  

    Como resolver isso??  
    Veremos nas próximas maneiras de resolver esse exercicio.
