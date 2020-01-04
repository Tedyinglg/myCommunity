package com.example.springbootexample.controller;

import com.example.springbootexample.mapper.UserMapper;
import com.example.springbootexample.mode.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AutoController {

    // GetMapping("/")

    @GetMapping("/index") // correspond to html website
    public String greeting(@RequestParam(name="name1", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name); // name2 --> html get value using th: text
        return "index"; // correspond to html file
    }

/**
    @Autowired
    UserMapper userMapper;

    public String callback(){

        User user = new User();
        user.setAccount_id(98);
        user.setName(" ");
        user.setGmt_create(System.currentTimeMillis());
        user.setGmt_modified(user.getGmt_create());


        userMapper.insert(user);
        return null;
    }
*/

}

