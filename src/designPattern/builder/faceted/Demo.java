package designPattern.builder.faceted;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.lives()
                .street("Karapani")
                .postcode("829144")
                .works()
                .company("ABC")
                .designation("XYZ")
                .build();
        System.out.println(person);
    }
}
