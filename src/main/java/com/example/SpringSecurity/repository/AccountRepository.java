package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>
{
    Account findByCustomerId(Integer customerId);
}
