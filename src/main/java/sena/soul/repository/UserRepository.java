package sena.soul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import sena.soul.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByEmailAndPasshash(String email, String passhash);

    User findByEmail(String email);


}