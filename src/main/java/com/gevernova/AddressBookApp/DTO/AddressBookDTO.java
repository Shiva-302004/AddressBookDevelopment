package com.gevernova.AddressBookApp.DTO;


import lombok.*;

/**
 * DTO (Data Transfer Object)
 * Used to receive request data from client
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class AddressBookDTO {
    private String name;
    private String email;
    private String phone;
}

