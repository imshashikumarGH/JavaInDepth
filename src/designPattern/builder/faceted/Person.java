package designPattern.builder.faceted;

public class Person {
    private String street;
    private String postcode;
    private String city;
    private String company;
    private String designation;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", company='" + company + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
