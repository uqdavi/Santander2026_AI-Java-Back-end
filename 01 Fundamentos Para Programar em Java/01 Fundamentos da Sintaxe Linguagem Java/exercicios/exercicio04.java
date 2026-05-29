package exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade a primeira pessoa: ");
        int age1 = scanner.nextInt();
        System.out.println("Digite a idade a primeira pessoa: ");
        int age2 = scanner.nextInt();

        if( age1 > age2 ) System.out.printf("A diferença de idade dessas pessoas é: %s", age1-age2);
        else if ( age1 < age2 ) System.out.printf("A diferença de idade dessas pessoas é: %s", age2-age1);
        else System.out.printf("A diferença de idade dessas pessoas é: %s", 0);

    }
}
