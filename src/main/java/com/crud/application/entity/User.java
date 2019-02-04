package com.crud.application.entity;

import com.crud.application.dto.UserDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private Timestamp date;
    private String name;
    private String contactNumber;

    public User(UserDto userDto, Boolean isId){

        Timestamp dateStamp=new Timestamp(userDto.getDate());

        this.setContactNumber(userDto.getContactNumber());
        this.setName(userDto.getName());
        this.setDate(dateStamp);

        if(isId)
            this.setId(userDto.getId());

    }

}