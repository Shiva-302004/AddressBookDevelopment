package com.gevernova.AddressBookApp.Controllers;


import com.gevernova.AddressBookApp.DTO.AddressBookDTO;
import com.gevernova.AddressBookApp.Entity.AddressBook;
import com.gevernova.AddressBookApp.Services.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller
 * Handles HTTP requests
 */
@RestController
@RequestMapping("/api/addressbook")
public class AddressBookController {

    /**
     * Injecting Service dependency
     */
    @Autowired
    private AddressBookService service;

    /**
     * Create new contact
     */
    @PostMapping
    public ResponseEntity<AddressBook> addContact(@RequestBody AddressBookDTO dto) {
        AddressBook savedContact = service.addContact(dto);
        return ResponseEntity.ok(savedContact);
    }

    /**
     * Get all contacts
     */
    @GetMapping
    public ResponseEntity<List<AddressBook>> getAllContacts() {
        return ResponseEntity.ok(service.getAllContacts());
    }

    /**
     * Get contact by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<AddressBook> getContactById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getContactById(id));
    }

    /**
     * Update contact by ID
     */
    @PutMapping("/{id}")
    public ResponseEntity<AddressBook> updateContact(
            @PathVariable Long id,
            @RequestBody AddressBookDTO dto) {

        return ResponseEntity.ok(service.updateContact(id, dto));
    }

    /**
     * Delete contact by ID
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
        return ResponseEntity.ok("Contact deleted successfully");
    }
}

