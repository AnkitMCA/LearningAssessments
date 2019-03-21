package com.springmvc.question10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController  {
    @RequestMapping("/bindObj")
    protected ModelAndView test(@ModelAttribute("studentCO") StudentCO studentCO) throws Exception {
        ModelAndView modelAndView = new ModelAndView("dummy");
        return modelAndView;
    }
}