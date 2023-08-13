package apar.ten.tenants.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
  @GetMapping("/account/login")
  public String login(Model thmModel){
    thmModel.addAttribute("title", "Login");
    return "account/login";
  }
}
