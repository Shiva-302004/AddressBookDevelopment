package com.gevernova.AddressBookApp.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "name cannot be empty")
    @Size(min = 5)
    private String name;

    @NotNull(message = "name cannot be empty")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
            message = "Invalid email format"
    )
    private String email;

    @Size(min = 10)
    @NotNull(message = "name cannot be empty")
    private String phone;
}

