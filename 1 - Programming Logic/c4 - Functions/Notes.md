(Conteúdo da aula 61)

### Sintaxe para funções
Lembrando:  
Funções dentro de classes são chamadas de métodos

Exemplo:
Quando iniciamos uma classe, fazemos...

```
public class Main {

->     public static void main(String[] args) {

    }
}
```

Essa linha destacada representa a função que, como padrão, é executada primeiro. Ela torna nosso código executável.

Para definir nossa nova e própria função, faremos assim:

```
public class Main {

    public static void main(String[] args) {

    }

    public static void função(parametros) {

    }
}
```

Vamos entender parte por parte?
- public  =>  Deixa a função/método disponível em outras classes
- static  =>  Permite que seja utilizada sem a necessidade de criar um objeto
- void  =>  Usamos quando não retornar um valor que poderá ser aproveitado pelo programa, apenas executará uma ação.
    Então, por exemplo, se fosse uma função que retornasse o maior valor, iriamos trocar o _void_ por _int_
