package com.surya.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author surya
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

	private Integer categoryId;

	@NotBlank
	@Size(min = 6, max = 20)
	private String categoryTitle;

	@NotBlank
	@Size(min = 10, max = 100)
	private String categoryDescription;

}
