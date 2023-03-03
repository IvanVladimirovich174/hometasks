package com.finalhometask.finalhometask.repository;

import com.finalhometask.finalhometask.model.Film;
import com.finalhometask.finalhometask.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByFilmIdIn(List<Film> films);
}