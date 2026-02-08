package com.gevernova.AddressBookApp.Services;




import com.gevernova.AddressBookApp.DTO.AddressBookDTO;
import com.gevernova.AddressBookApp.Entity.AddressBook;
import com.gevernova.AddressBookApp.Repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation class
 * Contains actual business logic
 */
@Service
public class AddressBookServiceImpl implements AddressBookService {

    /**
     * Injecting Repository dependency
     */
    @Autowired
    private AddressBookRepository repository;

    /**
     * Add a new contact
     */
    @Override
    public String addContact(AddressBookDTO dto) {
        AddressBook contact = AddressBook.builder()
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .name(dto.getName())
                .build();
        repository.save(contact);
        return "new address created successfully";
    }

    /**
     * Fetch all contacts
     */
    @Override
    public List<AddressBookDTO> getAllContacts() {
        List<AddressBook> books=repository.findAll();
        return books.stream()
                .map(this::transform).toList();
    }

    private AddressBookDTO transform(AddressBook book){
        return AddressBookDTO.builder()
                .name(book.getName())
                .phone(book.getPhone())
                .email(book.getEmail())
                .build();
    }
    /**
     * Fetch contact by ID
     */
    @Override
    public AddressBookDTO getContactById(Long id) {
       AddressBook book=repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));
       return AddressBookDTO.builder()
               .name(book.getName())
               .phone(book.getPhone())
               .email(book.getEmail())
               .build();
    }

    /**
     * Update contact details
     */
    @Override
    public String updateContact(Long id, AddressBookDTO dto) {
        AddressBook contact = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));

        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());

        repository.save(contact);
        return "contact updated successsfully";
    }

    /**
     * Delete contact by ID
     */
    @Override
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}

