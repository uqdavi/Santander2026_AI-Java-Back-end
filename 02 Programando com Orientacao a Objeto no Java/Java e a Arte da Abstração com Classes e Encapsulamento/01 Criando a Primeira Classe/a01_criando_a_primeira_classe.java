public class a01_criando_a_primeira_classe {
    public static void main(String[] args) {

        var male = new Person_cpc("Davis");
//        male.setName("Joao");
//        male.setAge(12);

        var famele = new Person_cpc("Marys");
//        famele.setName("Maria");
//        famele.setAge(10);
        male.incAge();
        System.out.println(male.getName());
        System.out.println(male.getAge());
        System.out.println(famele.getName());
        System.out.println(famele.getAge());
    }
}
