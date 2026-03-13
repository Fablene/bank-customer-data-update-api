package com.bank.customerupdate.domain.model;

public class Customer {

    private final Long id;
    private final String firstname;
    private final String lastname;
    private String address;
    private String email;
    private String phone;

    public Customer(Long id,
                    String firstname,
                    String lastname,
                    String address,
                    String email,
                    String phone) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void changeEmail(String newEmail) {
        this.email = newEmail;
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }

    public void changePhone(String newPhone) {
        this.phone = newPhone;
    }
}