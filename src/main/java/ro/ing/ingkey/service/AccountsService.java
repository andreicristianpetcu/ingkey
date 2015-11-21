package ro.ing.ingkey.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.ing.ingkey.domain.IngAccount;
import ro.ing.ingkey.repository.AccountsRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by HackathonING on 11/20/2015.
 */

@Service
@Transactional
public class AccountsService {


    @Inject
    AccountsRepository accountsRepository;

    @Inject
    IngUserService ingUserService;

    public List<IngAccount> getAccountsByUsername(String username){
        return accountsRepository.findByIngId(ingUserService.getIngId(username));
    }

    public void insertAccountsForTest(){
        ingUserService.insertUserForTest();
        IngAccount acc1 = new IngAccount("acc1", "IBANRO123TEST1", 1000, "EUR", 1234);
        IngAccount acc2 = new IngAccount("acc2", "IBANRO123TEST2", 1050, "RON", 1234);
        IngAccount acc3 = new IngAccount("acc3", "IBANRO123TEST3", 2050, "USD", 1234);
        accountsRepository.saveAndFlush(acc1);
        accountsRepository.saveAndFlush(acc2);
        accountsRepository.saveAndFlush(acc3);
    }
}
