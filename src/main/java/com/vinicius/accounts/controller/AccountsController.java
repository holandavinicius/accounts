package com.vinicius.accounts.controller;

import com.vinicius.accounts.constants.AccountsConstants;
import com.vinicius.accounts.dto.CustomerDTO;
import com.vinicius.accounts.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api", produces={MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO){

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(new ResponseDTO(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
