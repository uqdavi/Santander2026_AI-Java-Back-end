package exercicios;

import java.util.Scanner;

public class exercicio01_ecj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for( int i = 1; i <= 10 ; i++  ) {
            System.out.printf("%s * %s = %s\n", number, i, number*i);
        }

    }
}
