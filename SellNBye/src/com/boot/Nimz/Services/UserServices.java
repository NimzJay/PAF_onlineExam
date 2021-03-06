package com.boot.Nimz.Services;

import com.boot.Nimz.Model.UserDTO;
import java.util.List;
import java.util.Optional;

public interface UserServices {

	List<UserDTO> findAllUsers();
	
	String saveUser(UserDTO userdata);

	String updateUser(UserDTO newuserdata);

	Optional<UserDTO> findById(Integer id);

	String dltById(Integer id);

}
