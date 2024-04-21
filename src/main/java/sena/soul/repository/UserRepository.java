package sena.soul.repository;

import org.springframework.data.repository.CrudRepository;

import sena.soul.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    User saveAndFlush(User user);
}
    

