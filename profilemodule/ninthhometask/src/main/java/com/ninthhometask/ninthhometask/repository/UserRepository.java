package com.ninthhometask.ninthhometask.repository;

import com.ninthhometask.ninthhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}