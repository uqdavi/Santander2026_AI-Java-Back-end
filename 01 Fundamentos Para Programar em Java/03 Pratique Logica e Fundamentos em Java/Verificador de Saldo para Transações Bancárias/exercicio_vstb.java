import java.util.Scanner;

public class exercicio_vstb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = scanner.nextInt();
        int value = scanner.nextInt();

        if( balance >= value ) System.out.println("Transacao aprovada");
        else System.out.println("Saldo insuficiente");

    }
}
