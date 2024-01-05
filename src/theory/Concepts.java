package theory;

@SuppressWarnings("ALL")
public class Concepts {

    /*
    *
    * Generics foi introduzido no Java 5 responsável por grandes mudanças
    *
    * Por exemplo, na Classe Holder temos uma classe que instancia um Object e recebe um Object como parâmetro e retorna esse Object
    * Para utilizar isso deveríamos fazer um casting desse Object para o formato esperado, string, Integer, etc). (Sem uso de Generics)
    *
    * O problema ocorre quando fazemos um casting errado que não aparecerá em tempo de compilação e sim na execução.
    * Para trazer uma facilidade e reduzir esses problemas podemos usar o generics na classe Holder renomeada para HolderG na source
    *
    * O Generics permite parametrizar um determinado tipo eliminando a necessidade de usar Object, ou seja, podemos criar uma classe que suporta coisas genéricas
    * Tipos genéricos e ao mesmo tempo não há necessidade de travar em Object para que a classe seja genérica suficiente.
    *
    * Para isso utilizamos um tipo parametrizado comumente definido pela letra <T> (de Type) => HolderG<T> => mas poderia ser qualquer outra letra ou nome
    * E em todos os lugares onde havia definido o tipo Object mudamos para o tipo T
    *
    * Na hora de instanciar não é obrigado utilizar o generics, PORÉM, é altamente recomendado.
    *
    * A partir do momento que usamos generic o Java vai avisar em tempo de compilação dos erros de tipo e no caso dos exemplos utilizados em App2 não é preciso fazer o casting
    * Isso inclui os parâmetros do construtor, se passar um tipo diferente do parametrizado já deixará de funcionar.
    *
    *
    * */
}
