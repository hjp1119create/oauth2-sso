package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

//@RestController
public class Controller {

    @RequestMapping("/client")
    public String home(Principal user) {
        return "Hello " + user.getName();
    }
}
