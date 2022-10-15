package com.thegaprado.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thegaprado.coursejava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
