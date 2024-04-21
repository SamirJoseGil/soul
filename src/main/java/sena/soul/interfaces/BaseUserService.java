package sena.soul.interfaces;

import sena.soul.models.User;

public interface BaseUserService {
    Iterable<User> getAllUsers();

    User addUser(User user);
}