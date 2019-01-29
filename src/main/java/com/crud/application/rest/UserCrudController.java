package com.crud.application.rest;


import com.crud.application.business.UserCrudBusinessLogic;
import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import com.crud.application.enums.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserCrudController{

    @Autowired
    UserCrudBusinessLogic userCrudBusinessLogic;

    @PostMapping(value="/save")
    public RestResponseDto saveUser(@RequestBody UserDto userDto){

        RestResponseDto restResponseDto=new RestResponseDto();

        try {
            restResponseDto = userCrudBusinessLogic.saveUser(userDto);
        }catch (Exception ex){
            restResponseDto.makeFailureResponse(Error.INTERNAL_SERVER_ERROR);
            return restResponseDto;
        }
        return restResponseDto;
    }

    @GetMapping(value = "/find")
    public RestResponseDto findUser(@RequestParam(value="id", required = false) Integer id,
                                    @RequestParam(value="contactNumber", required = false) String contactNumber){

        RestResponseDto restResponseDto=new RestResponseDto();

        try {
            restResponseDto = userCrudBusinessLogic.findUser(id,contactNumber);
        }catch (Exception ex){
            restResponseDto.makeFailureResponse(Error.INTERNAL_SERVER_ERROR);
            return restResponseDto;
        }
        return restResponseDto;

    }

    @GetMapping(value = "/findAll")
    public RestResponseDto findAllUsers(){
        RestResponseDto restResponseDto=new  RestResponseDto();

        try {
            restResponseDto = userCrudBusinessLogic.findAll();
        }catch (Exception ex){
            restResponseDto.makeFailureResponse(Error.INTERNAL_SERVER_ERROR);
            return restResponseDto;
        }
        return restResponseDto;

    }

    @PutMapping(value="/update")
    public RestResponseDto updateUser(@RequestBody UserDto userDto){

        RestResponseDto restResponseDto=new RestResponseDto();

        try {
            restResponseDto = userCrudBusinessLogic.saveUser(userDto);
        }catch (Exception ex){
            restResponseDto.makeFailureResponse(Error.INTERNAL_SERVER_ERROR);
            return restResponseDto;
        }
        return restResponseDto;
    }

}