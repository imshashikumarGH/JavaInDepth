package designPattern.builder;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder personBuilder = new EmployeeBuilder();
        Person shashi = personBuilder.name("Shashi")
                .position("developer").build();
        System.out.println(shashi);
    }
}
