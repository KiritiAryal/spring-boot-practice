package com.example.spring.controller;

import com.example.spring.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public void hello(){
        System.out.println("Hello!");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/returnHello")
    public String sayHello(){
        return "Hello you!";
    }

    //HardCoded
    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public User userData(){
        return new User("1", "Kiriti", "USA");
    }

    //Dynamic with param key value (*use ? key = value & ..)
    @RequestMapping(method = RequestMethod.GET, value = "/userList")
    public List<User> userList(@RequestParam String id, @RequestParam String userName, @RequestParam String address){
        List<User> list = new ArrayList<>();
        User user = new User(id, userName, address);
        list.add(user);
        return list;
    }

    //Dynamic with PathVaraible(*use /value/value...)
    @RequestMapping(method = RequestMethod.GET, value = "/userListWithPathVariable/{id}/{userName}/{address}")
    public List<User> userList1(@PathVariable String id, @PathVariable String userName, @PathVariable String address){
        List<User> list = new ArrayList<>();
        User user = new User(id, userName, address);
        list.add(user);
        return list;
    }
}
