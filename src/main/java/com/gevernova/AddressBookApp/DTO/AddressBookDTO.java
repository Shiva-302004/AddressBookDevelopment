package com.gevernova.AddressBookApp.DTO;



/**
 * DTO (Data Transfer Object)
 * Used to receive request data from client
 */
public class AddressBookDTO {

    private String name;
    private String email;
    private String phone;

    // Default constructor
    public AddressBookDTO() {}

    // Parameterized constructor
    public AddressBookDTO(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // ---------- Getters and Setters ----------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

