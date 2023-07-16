package com.authenticate.userAuthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    @GetMapping
    public String loggedInMessage(){
        return ("Successfully Logged in!");
    }
}
