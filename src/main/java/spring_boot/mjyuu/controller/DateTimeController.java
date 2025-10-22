package spring_boot.mjyuu.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateTimeController {

    @GetMapping("/times")
    public String showDateTime(Model model) {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        model.addAttribute("currentDateTime", now);
        return "pages/time"; // maps to templates/pages/time.html
    }
}

