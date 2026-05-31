import java.time.OffsetDateTime;

public class Person_cpc {

    private final String name; // final == variavel constante!
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

//    public void setName(String name) {
//        this.name = name;
//        // this = nesse contexto, me da a variavel name atribui para ela esse name que estou recebendo como parametro
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Person_cpc(String name) {
        this.name = name;
        this.age = 1;
    }

    private int lastYearAgeInc = OffsetDateTime.now().getYear();
    public void incAge() {
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
