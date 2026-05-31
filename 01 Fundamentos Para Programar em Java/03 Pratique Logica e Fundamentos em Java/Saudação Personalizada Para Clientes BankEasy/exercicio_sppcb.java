import java.util.Scanner;

public class exercicio_sppcb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String type = scanner.next();

        switch (type) {
            case "corrente" -> System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", name, type);
            case "poupanca" -> System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", name, type);
            case "investimento" -> System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", name, type);
            default -> System.out.println("Tipo de conta invalido.");
        }

    }
}
