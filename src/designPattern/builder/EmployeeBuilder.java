package designPattern.builder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder position(String name) {
        person.setPosition(name);
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }

}
