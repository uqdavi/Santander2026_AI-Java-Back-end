import java.util.Scanner;

public class a02_switch_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero de 1 a 4");
        var option = scanner.nextInt();

//        switch (option) {
//            case 1:
//                System.out.println("Numero 1");
//                break;
//            case 2:
//                System.out.println("Numero 2");
//                break;
//            case 3:
//                System.out.println("Numero 3");
//                break;
//            default:
//                System.out.println("Opcao Invalida!");
//                break;
//        }

        switch (option) {
            case 1 -> System.out.println("Numero 1");
            case 2 -> System.out.println("Numero 2");
            case 3 -> System.out.println("Numero 3");
            default -> System.out.println("Opcao invalida!");
        }
    }
}
