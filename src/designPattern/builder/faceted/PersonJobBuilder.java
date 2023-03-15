package designPattern.builder.faceted;

public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder company(String company) {
        person.setCompany(company);
        return this;
    }

    public PersonJobBuilder designation(String designation) {
        person.setDesignation(designation);
        return this;
    }
}
