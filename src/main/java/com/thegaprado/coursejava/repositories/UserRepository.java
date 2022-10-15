package com.thegaprado.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thegaprado.coursejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
