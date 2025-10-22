package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import spring_boot.mjyuu.DTO.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex03Controller {

    @GetMapping("/userForm")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "pages/userForm";
    }

    @PostMapping("/trueLogin")
    public String trueLogin(@ModelAttribute User user, Model model) {
        // Access the submitted user data
        model.addAttribute("username", user.getId());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("password", user.getPw()); // Optional: hide/mask in view

        return "redirect:/index"; // or return a result page
    }

    @GetMapping("/exJson")
    public @ResponseBody User httpGet() {
        User user = User.builder()
                .id("Miku123")
                .email("miku@example.com")
                .pw("password123")
                .build();
        return user;
    }
}
