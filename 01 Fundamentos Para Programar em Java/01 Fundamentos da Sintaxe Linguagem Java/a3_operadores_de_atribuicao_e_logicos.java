import java.util.Scanner;

public class a3_operadores_de_atribuicao_e_logicos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // Operador de atribuição ( = )

        // System.out.println("quanto e 2 + 2? ");
        // var result = scanner.nextInt();
        // System.out.printf("voce acertou? %s", result == 4); // ( == ): igualdade ; ( != ): diferente

        System.out.println("Qnts anos voce tem? ");
        var age = scanner.nextInt();
        // var canDrive = age >= 18; // (>): maior que, (<): menor que, (>=): maior ou igual
        var isEmancipated = true;
        var canDrive = age >= 18 || isEmancipated; // ( || ): or ; ( && ): e
        System.out.printf("Voce pode dirigir? %s", canDrive);
    }
}
