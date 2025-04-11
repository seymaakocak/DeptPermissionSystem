package com.department.permission.user.service;
import com.department.permission.user.dto.UserDTO;
import com.department.permission.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
    User updateUser(Long id, UserDTO userDTO);

}
