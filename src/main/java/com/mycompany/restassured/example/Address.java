package com.mycompany.restassured.example;

import java.util.Objects;

public class Address {
    private String firstLineAddress;
    private String secondLineAddress;
    private String postCode;
    private String city;
    private String country;

    public String getFirstLineAddress() {
        return this.firstLineAddress;
    }

    public void setFirstLineAddress(String firstLineAddress) {
        this.firstLineAddress = firstLineAddress;
    }

    public String getSecondLineAddress() {
        return this.secondLineAddress;
    }

    public void setSecondLineAddress(String secondLineAddress) {
        this.secondLineAddress = secondLineAddress;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Address)) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(firstLineAddress, address.firstLineAddress) && Objects.equals(secondLineAddress, address.secondLineAddress) && Objects.equals(postCode, address.postCode) && Objects.equals(city, address.city) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstLineAddress, secondLineAddress, postCode, city, country);
    }

    @Override
    public String toString() {
        return "{" +
            " firstLineAddress='" + getFirstLineAddress() + "'" +
            ", secondLineAddress='" + getSecondLineAddress() + "'" +
            ", postCode='" + getPostCode() + "'" +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }
}