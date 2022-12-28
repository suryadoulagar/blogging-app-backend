package com.surya.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.blog.entities.User;

/**
 * @author surya
 *
 */
public interface UserRepo extends JpaRepository<User, Integer> {

}
