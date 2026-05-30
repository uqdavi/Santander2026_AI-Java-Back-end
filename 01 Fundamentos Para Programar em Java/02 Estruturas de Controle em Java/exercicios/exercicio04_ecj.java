package exercicios;

import java.util.Scanner;

public class exercicio04_ecj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero inicial");
        int initialNumber = scanner.nextInt();

        int num = 0;
        do {
            System.out.println("Digite um numero");
            num = scanner.nextInt();

            if(num < initialNumber) continue;

//            System.out.printf("Numero incial: %s", initialNumber);
        } while ((num % initialNumber) == 0);

    }
}
