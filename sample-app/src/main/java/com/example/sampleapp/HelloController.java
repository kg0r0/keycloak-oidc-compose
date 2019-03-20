package com.example.sampleapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class HelloController {

    @RequestMapping(value="/hello")
    public ModelAndView hello(HttpSession ses, ModelAndView mav, Locale locale) {
        mav.setViewName("hello");
        mav.addObject("message", "Hello! Spring Boot and Keycloak!");
        return mav;
    }

    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "redirect:/";
    }
}
