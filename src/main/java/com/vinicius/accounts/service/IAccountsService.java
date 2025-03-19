package com.vinicius.accounts.service;

import com.vinicius.accounts.dto.CustomerDTO;
import com.vinicius.accounts.entity.Customer;

public interface IAccountsService {

    void createAccount(CustomerDTO customerDTO);


}
