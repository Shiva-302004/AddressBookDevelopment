package com.gevernova.AddressBookApp.Services;




import com.gevernova.AddressBookApp.DTO.AddressBookDTO;
import com.gevernova.AddressBookApp.Entity.AddressBook;

import java.util.List;

/**
 * Service interface
 * Contains business logic method declarations
 */
public interface AddressBookService {

    String addContact(AddressBookDTO dto);

    List<AddressBookDTO> getAllContacts();

    AddressBookDTO getContactById(Long id);

    String updateContact(Long id, AddressBookDTO dto);

    void deleteContact(Long id);
}
