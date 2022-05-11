package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ChengJianSheng
 * @date 2019-03-03
 */
@Controller
public class LoginController {

    @ResponseBody
    @PostMapping("/authentication/form1")
    public String login(HttpServletRequest request) {
        System.out.println(request.getParameterMap());
        return "";
    }

    @ResponseBody
    @PostMapping("/client")
    public String client(HttpServletRequest request) {
        return "[client3] hello";
    }
}
