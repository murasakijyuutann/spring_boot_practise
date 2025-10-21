package spring_boot.mjyuu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ex02") // Base URL mapping for this controller
@RestController
public class ExController_2 {
 
    @RequestMapping("/rest") // second part of the URL mapping
    public String requestMethod() {
        return "<h2>@RestController An Example.</h2>"; // This maps to templates/pages/view02.html
    }
    
    @GetMapping("/rest2") // second part of the URL mapping
    public String requestMethod2() {
        return "<h2>@RestController An Example Second one.</h2>"; // This maps to templates/pages/view02.html
    }
}


