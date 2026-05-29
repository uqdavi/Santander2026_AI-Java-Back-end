public class a05_operadores_bitwise {
    public static void main(String[] args) {

        var value1 = 4;
        var value2 = 5;

        System.out.printf("Primeiro numero da operacao: %s \n", Integer.toBinaryString(value1));
        System.out.printf("Segundo numero da operacao: %s \n", Integer.toBinaryString(value2));

//        var result = value1 | value2;
//        System.out.printf("%s | %s = %s (representacao binaria: %s)\n", value1, value2, result, Integer.toBinaryString(result));

//        var result = value1 & value2;
//        System.out.printf("%s & %s = %s (representacao binaria: %s)\n", value1, value2, result, Integer.toBinaryString(result));

        var result = value1 ^ value2;
        System.out.printf("%s ^ %s = %s (representacao binaria: %s)\n", value1, value2, result, Integer.toBinaryString(result));
    }

    /*
    0 = false
    1 = true
    110
    101
    111
     */
}
