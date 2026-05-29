package exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do retangulo");
        int base = scanner.nextInt();
        System.out.println("Digite o tamanho da altura do retangulo");
        int height = scanner.nextInt();

        int area = base*height;

        System.out.printf("A area do retangulo é: %s", area);

    }
}
