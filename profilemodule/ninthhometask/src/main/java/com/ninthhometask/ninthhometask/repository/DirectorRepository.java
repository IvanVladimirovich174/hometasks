package com.ninthhometask.ninthhometask.repository;

import com.ninthhometask.ninthhometask.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
}