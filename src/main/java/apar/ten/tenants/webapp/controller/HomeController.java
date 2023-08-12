package apar.ten.tenants.webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

  @Value("${info.app.name}")
  private String title;
  @Value("${info.app.description}")
  private String description;

 @GetMapping("/")
 public String home(Model thModel){
  thModel.addAttribute("title",title + " | "+description);
  return "index";
 } 
}