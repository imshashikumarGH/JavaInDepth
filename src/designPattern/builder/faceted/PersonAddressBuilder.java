package designPattern.builder.faceted;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder street(String name) {
        this.person.setStreet(name);
        return this;
    }

    public PersonAddressBuilder postcode(String name) {
        this.person.setPostcode(name);
        return this;
    }
}
