package com.estsoft.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본 홈 페이지 요청

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
