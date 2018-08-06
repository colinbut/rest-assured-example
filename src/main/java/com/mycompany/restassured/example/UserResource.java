package com.mycompany.restassured.example;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {
    
    private Map<Integer, User> userList = new HashMap<Integer,User>();

    @PostConstruct
    private void init(){
        userList.put(1, getUser());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserDetails(@PathVariable("userId") Integer userId) {
        return ResponseEntity.ok(userList.get(userId));
    }

    private User getUser() {
        User user = new User();
        user.setUserId(1);
        user.setFirstName("Joe");
        user.setSecondName("Bloggs");
        user.setDob(new Date(1980, 8, 29));
        user.setEmail("me@email.com");
        
        Address address = new Address();
        address.setFirstLineAddress("My First Line Address");
        address.setSecondLineAddress("My Second Line Address");
        address.setPostCode("MU3 28P");
        address.setCity("Paris");
        address.setCountry("UK");
        user.setAddress(address);
        
        return user;
    }
}
