package com.gevernova.AddressBookApp.Repository;




import com.gevernova.AddressBookApp.Entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer
 * Handles database operations
 */
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {
    // JpaRepository provides CRUD methods automatically
}

