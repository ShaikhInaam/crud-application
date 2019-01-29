package com.crud.application.service;

import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import com.crud.application.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserCrudService {


    RestResponseDto saveUser(UserDto userDto);
    RestResponseDto updateUser(UserDto userDto);
    RestResponseDto deleteUser(UserDto userDto);
    User checkDuplicateContact(UserDto userDto);
    RestResponseDto findById(Integer id);
    RestResponseDto findByContactNumber(String contactNumber);
    RestResponseDto findAll();
}