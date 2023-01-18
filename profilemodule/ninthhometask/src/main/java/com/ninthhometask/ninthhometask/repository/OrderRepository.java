package com.ninthhometask.ninthhometask.repository;

import com.ninthhometask.ninthhometask.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}