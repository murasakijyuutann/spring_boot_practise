package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginTestController {

    @GetMapping("/login")
    public String showLoginPage(
            @RequestParam(name = "id", required = false, defaultValue = "") String id,
            @RequestParam(name = "pw", required = false, defaultValue = "") String pw,
            Model model) {

        if (!id.isEmpty() && !pw.isEmpty()) {
            model.addAttribute("message", "Login successful!");
        } else {
            model.addAttribute("message", "Please enter your credentials.");
        }

        model.addAttribute("id", id);
        model.addAttribute("pw", pw);
        return "pages/loginTest"; // templates/pages/loginTest.html
    }
}
