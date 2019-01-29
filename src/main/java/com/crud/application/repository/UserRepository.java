package com.crud.application.repository;

import com.crud.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    User findByDate(Timestamp date);
    User findByName(String name);
    User findByContactNumber(String contactNumber);
    User findUserById(Integer id);

}