package ro.ing.ingkey.web.rest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ro.ing.ingkey.Application;
import ro.ing.ingkey.domain.IngAccount;
import ro.ing.ingkey.service.AccountsService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by HackathonING on 11/20/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class AccountsServiceTest {
    @Inject
    AccountsService accountsService;

    @Before
    public void init(){
        accountsService.insertAccountsForTest();
    }
    @Test
    public void test(){
        List<IngAccount> accounts = accountsService.getAccountsByUsername("Ramona-Radu");
        Assert.assertNotNull(accounts);
    }

}
