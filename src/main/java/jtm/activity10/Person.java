package jtm.activity10;

import java.util.Date;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private Date birthDate;
    private String company;
    private String qoute;


     /*
     TODO
     1. Add getters, setters
     2. Add toString() method
     3. Add equals and hash code method

     //Hint:: All of the necessary methods can be generated
      */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getQoute() {
        return qoute;
    }

    public void setQoute(String qoute) {
        this.qoute = qoute;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", birthDate=" + birthDate +
                ", company='" + company + '\'' +
                ", qoute='" + qoute + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getCountry(), person.getCountry()) &&
                Objects.equals(getCity(), person.getCity()) &&
                Objects.equals(getBirthDate(), person.getBirthDate()) &&
                Objects.equals(getCompany(), person.getCompany()) &&
                Objects.equals(getQoute(), person.getQoute());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getCountry(), getCity(), getBirthDate(), getCompany(), getQoute());
    }
}
