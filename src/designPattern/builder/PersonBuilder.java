package designPattern.builder;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    public Person build() {
        return person;
    }
}
