package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExController_3 {

    @GetMapping("/ex03")
    public String requestMethod(Model model) {
        model.addAttribute("data01", "Hello Model World!");
        model.addAttribute("data02", "This is ExController_3.java");
        return "pages/view03"; // This maps to templates/pages/view03.html
    }
}
