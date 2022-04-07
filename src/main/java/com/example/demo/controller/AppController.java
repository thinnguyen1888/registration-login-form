package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

  @GetMapping(value = "/list-user")
  public String listUser(Model model) {
    List<User> list = userDao.findAll();
    model.addAttribute("list", list);
    return "list-user";
  }

  @PostMapping(value = "/process")
  public String process(User user) {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String encodedPassword = encoder.encode(user.getPassword());
    user.setPassword(encodedPassword);

    userDao.save(user);
    return "register-success";
  }
}
