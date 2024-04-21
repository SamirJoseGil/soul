package sena.soul.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.soul.repository.UserRepository;
import sena.soul.models.User;
import sena.soul.services.UserService;


@RestController
@RequestMapping("/soul/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/getall")
    public ResponseEntity<Iterable<User>> getAllUsers(){
        
        var users = new UserService(userRepository).getAllUsers();
        return new ResponseEntity<Iterable<User>>(users, HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user){

        var createdUser = new UserService(userRepository).addUser(user);        

        // Operador Ternario ?:
        return createdUser.getId() == 0 ? new ResponseEntity<User>(createdUser, HttpStatus.BAD_REQUEST) :
            new ResponseEntity<User>(createdUser, HttpStatus.OK);
    }

}

