package com.authenticate.userAuthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String loggedInMessage(){
        return ("Successfully Logged in!");
    }
}
