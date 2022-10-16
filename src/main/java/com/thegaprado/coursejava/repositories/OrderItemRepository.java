package com.thegaprado.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thegaprado.coursejava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
