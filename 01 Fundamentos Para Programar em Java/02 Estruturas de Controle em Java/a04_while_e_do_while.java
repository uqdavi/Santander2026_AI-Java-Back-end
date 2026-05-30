import java.util.Scanner;

public class a04_while_e_do_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
//        while (number != 0) {
//            System.out.println("Ok!");
//            number = scanner.nextInt();
//        }

        do {
            number = scanner.nextInt();
            System.out.println("ok!");

            if(number == 0) break;
        } while (number != 0);
    }
}
