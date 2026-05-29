package exercicios;


import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado de um quadrado");
        int side = scanner.nextInt();

        int area = (int) Math.pow(side, 2);

        System.out.printf("A area do quadrado é: %s", area);

    }
}
