package ir.ac.sbu.twitter.repository;

import ir.ac.sbu.twitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getAllByFollowerContains(User u);
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String username);
    User save(User s);
}
