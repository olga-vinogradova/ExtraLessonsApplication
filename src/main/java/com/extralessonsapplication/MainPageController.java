package com.extralessonsapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping("/")
    public String displayHomePage() {
        return "index";
    }

    @GetMapping("/about")
    public String displayAboutProjectPage(){
        return "about";
    }
}


