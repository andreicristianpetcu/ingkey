package ro.ing.ingkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ing.ingkey.domain.IngAccount;

import java.util.List;
import java.util.Optional;

/**
 * Created by HackathonING on 11/20/2015.
 */
public interface AccountsRepository extends JpaRepository<IngAccount, String> {

    Optional<IngAccount> findByAccountId(String id);

    List<IngAccount> findByIngId(long ingId);
}
