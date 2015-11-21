package ro.ing.ingkey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ing.ingkey.domain.IngUser;

import java.util.Optional;

/**
 * Created by HackathonING on 11/20/2015.
 */

public interface IngUserRepository extends JpaRepository<IngUser, Long> {

    Optional<IngUser> findByIngId(long id);

    Optional<IngUser> findByUsername(String username);
}
