package com.hanshenwang.projectisidore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String homeInit()  {
        return "post0001";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/blog")
    public String blogInit()  {
        return "blogtemp";
    }

    @GetMapping("/login")
    public String loginInit() {
        return "login";
    }

    @GetMapping("/about")
    public String aboutInit() {
        return "about";
    }

    @GetMapping("/work")
    public String workInit() {
        return "work";
    }
}
