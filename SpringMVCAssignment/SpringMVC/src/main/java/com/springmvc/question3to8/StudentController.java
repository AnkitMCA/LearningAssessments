package com.springmvc.question3to8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class StudentController {
    //Question3
    @RequestMapping("/")
    public String Hello(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return "/index.jsp";
    }

    // Question 4
    @RequestMapping("/test")
    @ResponseBody
    public String Hello() throws Exception {
        return "hello world";
    }

    //Question5
    @RequestMapping("/hello")
    public ModelAndView Hello1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

        //Question6
        @RequestMapping("/getValue/{value1}")
        @ResponseBody
        public String Hello2(@PathVariable("value1") Integer val) throws Exception {
            return ""+val;
        }

    //Question7
    @RequestMapping("/getMap/{value1}/{value2}")
    @ResponseBody
    public String Hello2(@PathVariable Map<String,String> map) throws Exception {
        return ""+map;
    }

    //Question8
    @RequestMapping("/getParam")
    @ResponseBody
    public String Hello2(@RequestParam("name") String name) throws Exception {
        return ""+name;
    }
}

