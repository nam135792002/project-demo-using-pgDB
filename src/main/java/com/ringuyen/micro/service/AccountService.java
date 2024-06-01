package com.ringuyen.micro.service;

import com.ringuyen.micro.model.AccountDTO;

import java.util.List;

public interface AccountService {
    AccountDTO add(AccountDTO accountDTO);
    void update(AccountDTO accountDTO);
    void updatePassword(AccountDTO accountDTO);
    void delete(Integer id);
    List<AccountDTO> getAll();
    AccountDTO get(String id);
}
