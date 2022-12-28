package com.surya.blog.services;

import java.util.List;

import com.surya.blog.payloads.CategoryDto;

/**
 * @author surya
 *
 */
public interface CategoryService {

	/**
	 * @param categoryDto
	 * @return
	 */
	public CategoryDto createCategory(CategoryDto categoryDto);

	/**
	 * @param categoryDto
	 * @param CategoryId
	 * @return
	 */
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer CategoryId);

	/**
	 * @param categoryId
	 */
	public void deleteCategory(Integer categoryId);

	/**
	 * @param categoryId
	 * @return
	 */
	public CategoryDto getCategoryById(Integer categoryId);

	/**
	 * @return
	 */
	public List<CategoryDto> getAllCategories();
}
