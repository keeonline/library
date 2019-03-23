package keeonline.model;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
    private static int nextId = 0;

    private int customerId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int houseNumber;
    private String postCode;

    public Customer(){
    }

    public Customer(String firstName,String lastName,String dobString,int houseNumber,String postCode){
        this.customerId = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = LocalDate.parse(dobString);  // date format must be '2011-12-03'
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId &&
                houseNumber == customer.houseNumber &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(dob, customer.dob) &&
                Objects.equals(postCode, customer.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, dob, houseNumber, postCode);
    }
}
