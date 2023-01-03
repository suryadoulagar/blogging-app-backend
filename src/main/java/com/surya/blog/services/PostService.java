package com.surya.blog.services;

import java.util.List;

import com.surya.blog.entities.Post;
import com.surya.blog.payloads.PostDto;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	PostDto updatePost(PostDto postDto, Integer postId);

	void deletePost(Integer postId);

	List<PostDto> getAllPosts(Integer pageNumber, Integer pageSize);

	PostDto getPostById(Integer postId);

	List<PostDto> getPostByCategory(Integer categoryId);

	List<PostDto> getPostByUser(Integer userId);

//	search post using keyword
	List<Post> searchPost(String keyword);
}
