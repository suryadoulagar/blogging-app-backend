package com.surya.blog.services;

import java.util.List;

import com.surya.blog.payloads.CategoryDto;

public interface CategoryService {

	
//	create
	public CategoryDto createCategory(CategoryDto categoryDto);
//	update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer CategoryId);
//	delete
	public void deleteCategory(Integer categoryId);
//	get
	public CategoryDto getCategoryById(Integer categoryId);
//	getAll
	public List<CategoryDto> getAllCategories();
}
