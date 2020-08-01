package com.hanshenwang.projectisidore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BlogController {

    @GetMapping("/blog/{id}")
    public String getPostId(@PathVariable String id) {
        return "getPostId";
    }

}
