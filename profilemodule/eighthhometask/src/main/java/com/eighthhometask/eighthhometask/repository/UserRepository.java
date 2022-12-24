package com.eighthhometask.eighthhometask.repository;

import com.eighthhometask.eighthhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}