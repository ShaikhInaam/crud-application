package com.crud.application.service;


import com.crud.application.dto.RestResponseDto;
import com.crud.application.dto.UserDto;
import com.crud.application.entity.User;
import com.crud.application.service.java.UserCrudService;
import com.crud.application.utils.EntityHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


/*
@Sql(scripts = "classpath:data.sql")
@SqlGroup({
               @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:schema.sql"),
              @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:data.sql")
})*/


@SpringBootTest
@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:test-application.properties")
public class UserCrudServiceImplTest {

    @Autowired
    UserCrudService userCrudService;

    @Test
    public void testAddData(){
        UserDto userDto=new UserDto();
        userDto.setName("jahangir");
        userDto.setContactNumber("12258445");
        userDto.setDate(1538433799000L);

        RestResponseDto restResponseDto = userCrudService.saveUser(userDto);
        UserDto resultDto = (UserDto) restResponseDto.getData();

        userDto.setId(1);

        Assert.assertTrue(EntityHelper.isNotNull(restResponseDto.getData()));
        Assert.assertEquals(userDto,resultDto);

    }

    @Test
    public void testFindAllMethod(){

        List<User> userList = userCrudService.findAll();
        List<User> expectedUserList = new ArrayList<>();

        User user=new User();
        user.setId(1);
        user.setName("jahangi");
        user.setContactNumber("12258445");
        user.setDate(new Timestamp(1538433799000L));
        expectedUserList.add(user);

        Assert.assertEquals(expectedUserList,userList);
    }

    /*@Test
    public void testUpdateUser(){


        UserDto userDto=new UserDto();
        userDto.setName("khizer");
        userDto.setContactNumber("12258445");
        userDto.setDate(1538433799000L);

        RestResponseDto saveUserResponseDto = userCrudService.saveUser(userDto);
        Assert.assertTrue(EntityHelper.isNotNull(saveUserResponseDto.getData()));

        UserDto updateUserDto=new UserDto();
        updateUserDto.setId(2);
        updateUserDto.setName("inaam");
        updateUserDto.setContactNumber("12258445");
        updateUserDto.setDate(1538433799000L);

        RestResponseDto restResponseDto = userCrudService.updateUser(userDto);

        Assert.assertTrue(EntityHelper.isNotNull(restResponseDto.getData()));
        Assert.assertEquals(updateUserDto,(UserDto) restResponseDto.getData());



    }*/
}