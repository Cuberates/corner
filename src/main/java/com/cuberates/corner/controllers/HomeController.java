package com.cuberates.corner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping({"/", "/home", "/index"})
  public String getHome() { 
    return "forward:/home.html";
  }
  @GetMapping("/blog")
  public String getBlog() {
    return "forward:/blog.html";
  }
  @GetMapping("/contacts")
  public String getContact() {
    return "forward:/contacts.html";
  }
}
