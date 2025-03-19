package com.vinicius.accounts.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AccountsDTO {
    private Long accountNumber;

    private Long customerId;

    private String accountType;

    private String branchAddress;

}
