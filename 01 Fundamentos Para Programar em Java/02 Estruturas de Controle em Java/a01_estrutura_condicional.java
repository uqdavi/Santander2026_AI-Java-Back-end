public class a01_estrutura_condicional {
    public static void main(String[] args) {

        var name = "Davis";
        int age = 16;
        boolean isEmancipated = true;

        var message = "";
        if ( age >= 18 ) message = name + " Voce tem" + age + " anos, voce pode dirigir!";
        else if (age >= 16 && isEmancipated) message = "Apesar de ter " + age + " anos, voce pode dirigir!";
        else message=  name + " voce nao pode dirigir!";
        System.out.println(message);

        var message2 = "";
        boolean driverLicense = true;

        message2 = driverLicense ? "Voce e habilitado!" : "voce nao e habilitado";
        System.out.println(message2);
    }
}
