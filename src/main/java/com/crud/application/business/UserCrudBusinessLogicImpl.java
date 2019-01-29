package com.crud.application.business;

import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import com.crud.application.entity.User;
import com.crud.application.enums.Error;
import com.crud.application.service.UserCrudService;
import com.crud.application.utils.EntityHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserCrudBusinessLogicImpl implements UserCrudBusinessLogic{

    @Autowired
    UserCrudService userCrudService;

    @Override
    public RestResponseDto saveUser(UserDto userDto){

        RestResponseDto restResponseDto=new RestResponseDto();

        if(EntityHelper.isNull(userDto.getName()) || EntityHelper.isNull(userDto.getContactNumber())){
            restResponseDto.makeFailureResponse(Error.REQUIRED_FIELDS_MISSING);
            return restResponseDto;
        }
        userDto.setDate(System.currentTimeMillis());

        User user = userCrudService.checkDuplicateContact(userDto);
        if(EntityHelper.isNotNull(user)){
            restResponseDto.makeFailureResponse(Error.NUMBER_ALREADY_USED);
            return restResponseDto;
        }

        restResponseDto = userCrudService.saveUser(userDto);

        return restResponseDto;
    }

    @Override
    public RestResponseDto updateUser(UserDto userDto) {
        RestResponseDto restResponseDto=new RestResponseDto();

        if(EntityHelper.isNull(userDto.getId())){
            restResponseDto.makeFailureResponse(Error.REQUIRED_FIELDS_MISSING);
            return restResponseDto;
        }

        restResponseDto = userCrudService.updateUser(userDto);
        return  restResponseDto;
    }

    @Override
    public RestResponseDto deleteUser(UserDto userDto) {

        RestResponseDto restResponseDto=new RestResponseDto();
        if(EntityHelper.isNull(userDto.getId())){
            restResponseDto.makeFailureResponse(Error.REQUIRED_FIELDS_MISSING);
            return restResponseDto;
        }

        restResponseDto = userCrudService.deleteUser(userDto);
        return  restResponseDto;
    }

    @Override
    public RestResponseDto findUser(Integer id, String contactNumber) {

        RestResponseDto restResponseDto=new RestResponseDto();

        if(EntityHelper.isNull(id) && EntityHelper.isNull(contactNumber)){
            restResponseDto.makeFailureResponse(Error.REQUIRED_FIELDS_MISSING);
            return restResponseDto;
        }

        else if(EntityHelper.isNotNull(id)){
            restResponseDto = userCrudService.findById(id);
            return restResponseDto;
        }

        restResponseDto=userCrudService.findByContactNumber(contactNumber);
        return restResponseDto;

    }

    @Override
    public RestResponseDto findAll() {

        return  userCrudService.findAll();
    }

}