package com.estsoft.user.controller;

import com.estsoft.user.dto.UserDTO;
import com.estsoft.user.sevice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class UserController {

    //생성자 주입
    private final UserService userService;

    @GetMapping("/user/signup")
    public String signUp() {
        return "signup";
    }

    @PostMapping("/user/signup")
    public String signUp(@ModelAttribute UserDTO userDTO) {

        userService.save(userDTO);
        return "main";
    }


}
