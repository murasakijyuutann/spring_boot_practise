package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ExController_1 {
    // Add your methods and mappings here

    /*http://localhost:8080/ex01 */
   @RequestMapping("/ex01")
   public String requestMethod() {
       return "pages/view01"; // This maps to templates/pages/view01.html
   }
    
}
