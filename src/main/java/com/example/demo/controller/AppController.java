package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AppController {
  private final UserDao userDao;

  @GetMapping(value = "")
  public String home() {
    return "home";
  }

  @GetMapping(value = "/register")
  public String signUpPage(Model model) {
    model.addAttribute("user", new User());
    return "sign-up";
  }

  @PostMapping(value = "/process")
  public String process(User user) {
    userDao.save(user);
    return "register-success";
  }
}
