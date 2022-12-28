package com.surya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.blog.entities.Category;

/**
 * @author surya
 *
 */
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
