package com.crud.application.service.java;

import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import com.crud.application.entity.User;
import com.crud.application.enums.Error;
import com.crud.application.repository.UserRepository;
import com.crud.application.utils.EntityHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCrudServiceImpl implements UserCrudService {

    @Autowired
    UserRepository userRepository;

    @Override
    public RestResponseDto saveUser(UserDto userDto) {

        RestResponseDto restResponseDto=new RestResponseDto();
        User user=new User(userDto,false);
        user = userRepository.save(user);

        restResponseDto.makeSuccessResponse(new UserDto(user));
        return restResponseDto;

    }

    @Override
    public RestResponseDto updateUser(UserDto userDto) {

        RestResponseDto restResponseDto=new RestResponseDto();
        User user=new User(userDto,true);
        user=userRepository.save(user);


        restResponseDto.makeSuccessResponse(new UserDto(user));
        return restResponseDto;
    }

    @Override
    public RestResponseDto deleteUser(UserDto userDto) {

        RestResponseDto restResponseDto=new RestResponseDto();
        User user=new User(userDto,true);
        userRepository.delete(user);

        restResponseDto.makeSuccessResponse();
        return  restResponseDto;
    }

    @Override
    public User checkDuplicateContact(UserDto userDto){

        return userRepository.findByContactNumber(userDto.getContactNumber());
    }

    @Override
    public RestResponseDto findById(Integer id) {

        RestResponseDto restResponseDto=new RestResponseDto();

        User user = userRepository.findUserById(id);
        if(EntityHelper.isNull(user)){
            restResponseDto.makeFailureResponse(Error.USER_NOT_EXIST);
            return restResponseDto;
        }

        restResponseDto.makeSuccessResponse(new UserDto(user));
        return restResponseDto;
    }

    @Override
    public RestResponseDto findByContactNumber(String contactNumber) {
        RestResponseDto restResponseDto=new RestResponseDto();

        User user = userRepository.findByContactNumber(contactNumber);
        if(EntityHelper.isNull(user)){
            restResponseDto.makeFailureResponse(Error.USER_NOT_EXIST);
            return restResponseDto;
        }

        restResponseDto.makeSuccessResponse(new UserDto(user));
        return restResponseDto;

    }


    public List<User> findAll(){
        List<User> userList = userRepository.findAll();

        return userList;
    }

}