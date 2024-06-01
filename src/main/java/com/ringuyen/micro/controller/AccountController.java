package com.ringuyen.micro.controller;

import com.ringuyen.micro.model.AccountDTO;
import com.ringuyen.micro.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired private AccountService accountService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody AccountDTO accountDTO){
        return new ResponseEntity<>(accountService.add(accountDTO), HttpStatus.CREATED);
    }

    @GetMapping("/list-all")
    public ResponseEntity<?> list(){
        List<AccountDTO> listAccounts = accountService.getAll();
        if(listAccounts.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listAccounts);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> get(@PathVariable(value = "id") String id){
        return ResponseEntity.ok(accountService.get(id));
    }
}
