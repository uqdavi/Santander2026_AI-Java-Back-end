public record Person_tcr(String name, int age) {

    public Person_tcr{
        System.out.println("======");
        System.out.println(name);
        System.out.println(age);
        System.out.println("======");
    }

    public Person_tcr(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " Age: " + age;
    }

}
