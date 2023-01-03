package com.surya.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.blog.entities.Category;
import com.surya.blog.entities.Post;
import com.surya.blog.entities.User;

public interface PostsRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);
}
