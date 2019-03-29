package com.SpringThymeleaf.controller;

import com.SpringThymeleaf.enm.EmpType;
import com.SpringThymeleaf.entity.Employee;
import com.SpringThymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/")
@Controller
public class DemoController {

    List<Employee> employeeList = new ArrayList<>();


    @RequestMapping("")
    public String welcome() {
        return "index";
    }

    @GetMapping("alert")
    public String showAlert() {
        return "ShowAlert";
    }

    @GetMapping("showform")
    public ModelAndView showForm(Employee employee) {
        ModelAndView view = new ModelAndView("form");
        view.addObject("employee", employee);
        return view;
    }

    @PostMapping("empform")
    public ModelAndView formData(Employee employee) {
        employeeList.add(employee);
        ModelAndView view = new ModelAndView("formdata");
        view.addObject("employeeList", employeeList);
        return view;
    }

    @GetMapping("showtime")
    public String showtime() {
        return "servertime";
    }

    @GetMapping("timee")
    @ResponseBody
    public String timeData() {
        return new Date().toString();
    }


    @GetMapping("loaderform")
    public ModelAndView showForm(User user) {
        ModelAndView view = new ModelAndView("LoaderForm");
        view.addObject("user", user);
        return view;
    }

    @PostMapping("success")
    public ModelAndView success(User user) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ModelAndView view = new ModelAndView("success");
        view.addObject("user", user);
        return view;
    }

}
