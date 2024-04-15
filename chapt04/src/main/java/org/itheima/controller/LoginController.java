package org.itheima.controller;
import org.springframework.ui.Model;
import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/toLoginPage")
    public String toLoginPage(Model model) {
        model.addAttribute("currentYear",Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }
}
