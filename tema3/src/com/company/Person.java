package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String married;
    private String gender;
    private String address;

    public Person(String firstName, String lastName, Integer age, String gender, String married, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
        this.gender = gender;
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "<html>"+"First name: " + firstName + "<br><br>"+
                "Last name: " + lastName + "<br><br>" +
                "Age: " + age + "<br><br>" +
                "Gender: " + gender + "<br><br>"+
                "Married: " + married + "<br><br>" +
                "Address: " + address + "<html>" ;
    }
}
