/*
+ : soma
- : sub
* : multiplicacao
/ : divisao
% : modulo (resto da divisao)
Math.sqrt : raiz quadrada
Math.pow(value, 2) : potencia (value ao quadrado)
 */

import java.util.Scanner;

public class a04_trabalhando_com_operadores_aritmeticos {

    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//
//        System.out.println("Informe o primeiro numero");
//        var value1 = scanner.nextInt();
//
//        System.out.println("Informe o segundo numero");
//        var value2 = scanner.nextInt();
//
//        System.out.printf("%s + %s = %s", value1, value2, value1+value2);

//        var value = 5;
//        value += 12; // == value = value + 12 | serve para - * / tambem
//        System.out.println(value);

//        System.out.printf("A raiz quadrada de 16 é: %s", Math.sqrt(16)); // raiz quadrada
//        System.out.printf("16 elevado ao quadrado é: %s", Math.pow(16, 2));

//        var value = 50;
//        System.out.println(++value); // incrementa +1 e ja mostra
//        System.out.println(value);

        var value = 50;
        System.out.println(value++); // imprime o valor e incrementa +1 na proxima linha
        System.out.println(value);

    }

}
