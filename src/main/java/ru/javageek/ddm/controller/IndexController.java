package ru.javageek.ddm.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by max on 15/02/15.
 */
@Controller
@RequestMapping("")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "hello.do")
    @ResponseBody
    public String mainPage() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            // userDetails = auth.getPrincipal()
            UserDetails userDetails = (UserDetails) SecurityContextHolder
                    .getContext()
                    .getAuthentication()
                    .getPrincipal();
            return "Hello " + userDetails.getUsername();
        }
        return "Hello, ";
    }
}
