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
    public AddressBook addContact(AddressBookDTO dto) {
        AddressBook contact = new AddressBook();

        // Mapping DTO to Entity
        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());

        return repository.save(contact);
    }

    /**
     * Fetch all contacts
     */
    @Override
    public List<AddressBook> getAllContacts() {
        return repository.findAll();
    }

    /**
     * Fetch contact by ID
     */
    @Override
    public AddressBook getContactById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id: " + id));
    }

    /**
     * Update contact details
     */
    @Override
    public AddressBook updateContact(Long id, AddressBookDTO dto) {
        AddressBook contact = getContactById(id);

        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());

        return repository.save(contact);
    }

    /**
     * Delete contact by ID
     */
    @Override
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}

