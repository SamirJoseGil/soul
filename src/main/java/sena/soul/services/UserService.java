package sena.soul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sena.soul.repository.UserRepository;
import sena.soul.models.User;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        var userList = userRepository.findAll();
        return userList;
    }

    public boolean addUser(User user) {
        User result = userRepository.save(user);

        return result != null;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User validateUser(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        return user;
    }
}
