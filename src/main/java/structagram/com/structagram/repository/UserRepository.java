package structagram.com.structagram.repository;

import org.springframework.stereotype.Repository;

import structagram.com.structagram.model.Users;

@Repository
public interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<structagram.com.structagram.model.Users, Long> {
    
     Users findByUsername(String username);
     Users findByEmail(String email);


}
