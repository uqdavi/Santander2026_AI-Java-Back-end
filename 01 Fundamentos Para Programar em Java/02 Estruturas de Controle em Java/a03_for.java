import java.util.Scanner;

public class a03_for {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        for (;;) {
//            System.out.println("Digite um numero!");
//            int number = scanner.nextInt();
//
//            if( number == 0 ) break;
//        }

//        for ( int i = 0; i < 3 ; i++ ) {
//            System.out.println("Laco " + i);
//        }

//        for ( int i = 0 ; i < 10 ; i++ ) {
//            if( i % 2 != 0 ) continue;
//            System.out.println(i + " é par!");
//        }

        String[] names = {"Davi", "De", "Souza", "Silva"};
        for( var n : names ) System.out.printf("%s ", n);

    }
}
