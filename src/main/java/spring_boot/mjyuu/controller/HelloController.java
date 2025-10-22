package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index"; // This maps to templates/index.html
    }

    @GetMapping("/times")
    public String getCurrentTime(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return "pages/time"; // This maps to templates/pages/time.html
    }
    
}
