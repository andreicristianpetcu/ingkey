package ro.ing.ingkey.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.ing.ingkey.domain.IngUser;
import ro.ing.ingkey.repository.IngUserRepository;

import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by HackathonING on 11/20/2015.
 */
@Service
@Transactional
public class IngUserService {

    @Inject
    IngUserRepository ingUserRepository;

    public long getIngId(String username){
        Optional<IngUser> optionalUser = ingUserRepository.findByUsername(username);
        IngUser user= optionalUser.get();
        if(user != null) {
            return optionalUser.get().getIngId();
        }
        return 0;


    }

    public void insertUserForTest(){
        IngUser user = new IngUser(1234, "testUsername", "test", "tokenTest");
        ingUserRepository.saveAndFlush(user);
    }
}
