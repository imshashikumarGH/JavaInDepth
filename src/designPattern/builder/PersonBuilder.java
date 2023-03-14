package designPattern.builder;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person = new Person();

    public SELF name(String name) {
        person.setName(name);
        return (SELF) this;
    }

    public Person build() {
        return person;
    }

    // to override in EmployeeBuilder
    protected PersonBuilder self() {
        return (SELF) this;
    }
}
