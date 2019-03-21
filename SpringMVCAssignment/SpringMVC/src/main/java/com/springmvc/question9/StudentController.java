package com.springmvc.question9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentController  {
    @RequestMapping("/test")
    protected ModelAndView test(StudentCO studentCO) throws Exception {
        ModelAndView modelAndView = new ModelAndView("dummy");
        modelAndView.addObject("msg",studentCO);
        return modelAndView;
    }
}