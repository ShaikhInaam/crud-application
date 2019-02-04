package com.crud.application.dto;


import com.crud.application.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto{

    private Integer id;
    private Long date;
    private String name;
    private String contactNumber;

    public UserDto(User user){

        this.setContactNumber(user.getContactNumber());
        this.setName(user.getName());
        this.setDate(user.getDate().getTime());
        this.setId(user.getId());

    }

}