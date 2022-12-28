package com.surya.blog.services;

import java.util.List;

import com.surya.blog.payloads.UserDto;

/**
 * @author surya
 *
 */
public interface UserService {

	/**
	 * @param user
	 * @return
	 */
	UserDto createUser(UserDto user);

	/**
	 * @param user
	 * @param userId
	 * @return
	 */
	UserDto updateUser(UserDto user, Integer userId);

	/**
	 * @param userId
	 * @return
	 */
	UserDto getUserById(Integer userId);

	/**
	 * @return
	 */
	List<UserDto> getAllUsers();

	/**
	 * @param userId
	 */
	void deleteUser(Integer userId);

}
