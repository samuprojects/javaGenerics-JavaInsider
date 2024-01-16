import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

@SuppressWarnings("ALL")
public class ExClose {

    // Implementar método closeAll(), que recebe como parâmetro uma lista de objetos, para fechar todos os objetos.
    // Os objetos devem ser de uma classe que implementa a interface Closeable do Java

    public static void main(String[] args) {
        BufferedWriter obj1 = new BufferedWriter(null); // usado null apenas como exemplo para testar a escrita de um código que compila com a utilização do generics
        OutputStreamWriter obj2 = new OutputStreamWriter(null);

        var list =List.of(obj1, obj2);
        closeAll(list);
    }

    // ao utilizar T delimitando que serão de determinado tipo ou que implementam Closeable conseguimos garantir que outros tipos não sejam utilizados,
    // por exemplo, Strings e outras classes que não implementam Closeable (e consequentemente não possuem acesso ao método close)
    // T pode ser Closeable ou qualquer outra classe que herda de Closeable.
    public static <T extends Closeable> void closeAll(List<T> objects) { // exemplos: podemos passar uma lista de Writer, Reader, Closeable, etc
        objects.forEach(o -> {
            try {
                o.close();
            } catch (IOException e) {
                //Ignorado;
            }
        });
    }
}
