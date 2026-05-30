package exercicios;

import java.util.Scanner;

public class exercicio02_ecj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float height = scanner.nextFloat();

        System.out.println("Digite seu peso: ");
        float weight = scanner.nextFloat();

        float IMC = weight/(height*height);
        System.out.printf("Seu IMC é %s \n", IMC);

        if( IMC <= 18.5 ) System.out.println("Abaixo do peso");
        else if( IMC >= 18.6 && IMC <= 24.9 ) System.out.println("Peso ideal!");
        else if( IMC >= 25.0 && IMC <= 29.9 ) System.out.println("Levemente acima do peso");
        else if( IMC >= 30.0 && IMC <= 34.9 ) System.out.println("Obseidade Grau I");
        else if( IMC >= 35.0 && IMC <= 39.9 ) System.out.println("Obseidade Grau II (Severa)");
        else if( IMC >= 40.0 ) System.out.println("Obseidade Grau III (Mórbida)");



    }
}
