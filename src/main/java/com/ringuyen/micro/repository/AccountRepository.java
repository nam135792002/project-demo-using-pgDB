package com.ringuyen.micro.repository;

import com.ringuyen.micro.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, String> {

}
