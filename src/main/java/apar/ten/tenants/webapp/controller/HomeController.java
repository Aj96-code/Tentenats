package apar.ten.tenants.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

 @GetMapping("/")
 public String home(Model thModel){
  thModel.addAttribute("title", "Home Page");
  return "index";
 } 
}