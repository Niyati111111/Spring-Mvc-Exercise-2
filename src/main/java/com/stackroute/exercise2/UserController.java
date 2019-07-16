package com.stackroute.exercise2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("login")
    public ModelAndView greet(HttpServletRequest request, HttpServletResponse response){
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        User user = new User(name,password);
        ModelAndView view = new ModelAndView();
        view.setViewName("login");
        view.addObject("username",name);
        view.addObject("password",password);
        return view;
    }
}