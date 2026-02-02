package com.gevernova.AddressBookApp.Services;




import com.gevernova.AddressBookApp.DTO.AddressBookDTO;
import com.gevernova.AddressBookApp.Entity.AddressBook;

import java.util.List;

/**
 * Service interface
 * Contains business logic method declarations
 */
public interface AddressBookService {

    AddressBook addContact(AddressBookDTO dto);

    List<AddressBook> getAllContacts();

    AddressBook getContactById(Long id);

    AddressBook updateContact(Long id, AddressBookDTO dto);

    void deleteContact(Long id);
}
