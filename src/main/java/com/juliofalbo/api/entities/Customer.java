package com.juliofalbo.api.entities;

import com.juliofalbo.api.enums.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private CustomerStatus status;
    private String email;
    private LocalDateTime dateOfBirth;


}
