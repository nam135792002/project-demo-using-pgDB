package com.ringuyen.micro.service.implement;

import com.ringuyen.micro.entity.Account;
import com.ringuyen.micro.model.AccountDTO;
import com.ringuyen.micro.repository.AccountRepository;
import com.ringuyen.micro.service.AccountService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired private AccountRepository accountRepository;
    @Autowired private ModelMapper modelMapper;

    @Override
    public AccountDTO add(AccountDTO accountDTO) {
        Account account = modelMapper.map(accountDTO, Account.class);
        Account savedAccount = accountRepository.save(account);
        return modelMapper.map(savedAccount, AccountDTO.class);
    }

    @Override
    public void update(AccountDTO accountDTO) {
//        Account accountInDB = accountRepository.findById(accountDTO.getId()).get();
//        if(accountInDB != null){
//            modelMapper.typeMap(AccountDTO.class, Account.class)
//                    .addMappings(mapper -> mapper.skip(Account::setPassword)).map(accountDTO, accountInDB);
//        }
//
//        accountRepository.save(accountInDB);
    }

    @Override
    public void updatePassword(AccountDTO accountDTO) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<AccountDTO> getAll() {
        List<Account> listAccounts = accountRepository.findAll();
        return listAccounts.stream().map(account -> modelMapper.map(account, AccountDTO.class)).toList();
    }

    @Override
    public AccountDTO get(String id) {
        Account accountInDB = accountRepository.findById(id).get();
        return modelMapper.map(accountInDB, AccountDTO.class);
    }
}
