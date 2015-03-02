package ru.javageek.ddm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by max on 15/02/15.
 */
@Controller
public class LoginController {
    @RequestMapping(method = RequestMethod.GET, value = "login.do")
    public String showLogin() {
        return "login";
    }
}
