/* Comentario
 de varias
 linhas */

// import java.util.*; importa tudo que tem no java utils
import java.util.Scanner;

public class a01_padroes_de_desenvolvimento_e_conceitos {

    // final == Constante (importante o nome da variavel ser em maiusculo)
    static final String WELCOME_MESSAGE = "Ola, informe o seu nome: ";


    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        var scanner = new Scanner(System.in);
        // Constante
        System.out.println(WELCOME_MESSAGE);
        // String name = scanner.next();
        var name = scanner.next();

        // System.out.println("Ola, " + name); print + \n
        System.out.printf("Ola, %s", name); // print format
    }

}