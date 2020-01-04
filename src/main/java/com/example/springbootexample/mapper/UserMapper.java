package com.example.springbootexample.mapper;

import com.example.springbootexample.mode.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("inset into user (account_id, name, token, gmt_create, gmt_modified) " +
            "value (#{account_id}, #{name}, #{token}, #{gmt_create}, #{gmt_modified})")
    String insert(User user);
}
