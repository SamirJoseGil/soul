package sena.soul.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sena.soul.models.User;
import sena.soul.services.UserService;

import java.util.List;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping("/get_email")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@Param("email") String email) {
        return userService.getUserByEmail(email);
    }

    @GetMapping("/validate")
    @ResponseStatus(HttpStatus.OK)
    public User validateUser(@Param("email") String email, @Param("passhash") String password) {
        return userService.validateUser(email, password);
    }

    @PutMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> addUser(@RequestBody User user) {
        if (user.getPassword().isEmpty() || user.getPassword().length() < 8) {
            return new ResponseEntity<>("La contraseña debe ser mayor a 8 caracteres", HttpStatus.BAD_REQUEST);
        }

        boolean result = userService.addUser(user);

        if (result)
            return ResponseEntity.ok("Se ha creado el usuario correctamente");
        else
            return ResponseEntity.ok("No se ha podido crear el usuario");
    }





}

