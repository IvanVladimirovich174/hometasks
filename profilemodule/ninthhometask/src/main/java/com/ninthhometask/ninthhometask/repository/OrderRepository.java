package com.ninthhometask.ninthhometask.repository;

import com.ninthhometask.ninthhometask.model.Film;
import com.ninthhometask.ninthhometask.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByFilmIdIn(List<Film> films);
}