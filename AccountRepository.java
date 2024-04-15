package net.javaguides.bankingapp.repository;

import net.javaguides.bankingapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepository extends JpaRepository<Account,Long> {
}
