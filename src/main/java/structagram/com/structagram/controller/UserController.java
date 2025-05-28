package structagram.com.structagram.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import structagram.com.structagram.model.Users;
import structagram.com.structagram.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

     @PostMapping("/register")
     public ResponseEntity<String> createUser(@RequestBody Users user) {
         try {
             userService.createUsers(user);
                     return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");

            } catch (Exception e) {

                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());

         }
     }
     
}
