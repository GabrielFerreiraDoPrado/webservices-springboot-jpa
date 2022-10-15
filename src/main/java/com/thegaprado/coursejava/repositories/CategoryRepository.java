package com.thegaprado.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thegaprado.coursejava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
