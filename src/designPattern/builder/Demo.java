package designPattern.builder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person shashi = personBuilder.name("Shashi").build();
        System.out.println(shashi);
    }
}
