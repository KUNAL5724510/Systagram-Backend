package structagram.com.structagram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import structagram.com.structagram.repository.UserRepository;
import structagram.com.structagram.model.Users;

@Service
public class UserService {
  
    @Autowired
    private UserRepository userRepo;

    public Users createUsers(Users user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        return userRepo.save(user);
    }
}
