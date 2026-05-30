package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03_ecj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int number1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int number2 = scanner.nextInt();

        System.out.println("Digite Par ou Impar");
        String option = scanner.next();
        option = option.toLowerCase(Locale.ROOT);

        switch (option) {
            case "par" -> {
                int i = number1;
                while ( i <= number2 ) {
                    if( i % 2 == 0 ) System.out.printf("%s ", i);
                    i++;
                }
            }
            case "impar" -> {
                int i = number1;
                while ( i <= number2 ) {
                    if( i % 2 != 0 ) System.out.printf("%s ", i);
                    i++;
                }
            }
            default -> System.out.println("Opcao invalida!");
        }
    }
}
