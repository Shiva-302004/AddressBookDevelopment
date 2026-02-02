package com.gevernova.AddressBookApp.Entity;


import jakarta.persistence.*;

/**
 * Entity class represents the Address Book table in the database
 */
@Entity
@Table(name = "address_book")
public class AddressBook {

    /**
     * Primary key of the AddressBook table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the contact
     */
    private String name;

    /**
     * Email of the contact
     */
    private String email;

    /**
     * Phone number of the contact
     */
    private String phone;

    // Default constructor (required by JPA)
    public AddressBook() {}

    // Parameterized constructor
    public AddressBook(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // ---------- Getters and Setters ----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
