package com.vinicius.accounts.service;

import com.vinicius.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDTO);


    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
