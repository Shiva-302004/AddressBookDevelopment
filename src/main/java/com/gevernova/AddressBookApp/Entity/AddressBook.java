package com.gevernova.AddressBookApp.Entity;


import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class represents the Address Book table in the database
 */
@Entity
@Table(name = "address_book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
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

}
