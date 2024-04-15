package net.javaguides.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

//DTO - data transfer object
@AllArgsConstructor // to automatically generate constructor
@Data // to automatically generate getters setters
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
