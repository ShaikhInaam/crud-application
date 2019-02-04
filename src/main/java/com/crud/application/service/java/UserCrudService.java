package com.crud.application.service.java;

import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import com.crud.application.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserCrudService {


    RestResponseDto saveUser(UserDto userDto);
    RestResponseDto updateUser(UserDto userDto);
    RestResponseDto deleteUser(UserDto userDto);
    User checkDuplicateContact(UserDto userDto);
    RestResponseDto findById(Integer id);
    RestResponseDto findByContactNumber(String contactNumber);
    List<User> findAll();
}