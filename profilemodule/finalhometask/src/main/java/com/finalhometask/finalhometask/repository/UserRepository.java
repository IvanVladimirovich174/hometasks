package com.finalhometask.finalhometask.repository;

import com.finalhometask.finalhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByLoginAndDeletedFalse(String username);
    User findUsersByLogin(String login);
}