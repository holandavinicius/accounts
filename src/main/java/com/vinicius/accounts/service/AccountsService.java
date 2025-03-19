package com.vinicius.accounts.service;

import com.vinicius.accounts.dto.CustomerDTO;
import com.vinicius.accounts.repository.AccountsRepository;
import com.vinicius.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsService implements IAccountsService{

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDTO customerDTO) {

    }
}
