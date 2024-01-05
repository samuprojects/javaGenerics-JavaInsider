package theory;

@SuppressWarnings("ALL")
public class TypeErasure {

    /*
    * Como o Generics não é nativo do Java para manter a compatibilidade com as versões anteriores ao Java 5
    * Os engenheiros decidiram utilizar um recurso por nome Type Erasure
    * Consiste em apagar a informação do tipo de dado depois do processo de compilação
    *
    * Isso significa que o código compilado no bytecode não contém a escrita explícita do tipo parametrizado <T>
    * No arquivo class vai existir a escrita antiga que foi mostrado no App1 fazendo o casting explícito para o tipo passado no parâmetro
    *
    * Esse recurso ficou conhecido também como "syntactic sugar", ou “açúcar sintático”, onde a remoção do mesmo não prejudicará ou alterará em nada o resultado final.
    *
    * Usando generics você ganha proteção em tempo de compilação quanto ao tipo de dados, eliminado ocorrências de ClassCastException na execução
    *
    * */
}
