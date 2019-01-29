package com.crud.application.business;

import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserCrudBusinessLogic{


    RestResponseDto saveUser(UserDto userDto);
    RestResponseDto updateUser(UserDto userDto);
    RestResponseDto deleteUser(UserDto userDto);
    RestResponseDto findUser(Integer id, String contactNumber);
    RestResponseDto findAll();

}