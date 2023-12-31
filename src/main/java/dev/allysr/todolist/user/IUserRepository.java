
package dev.allysr.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * IUserRepository
 */
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
    
}