package spring_boot.mjyuu.controller.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerEx01 {

    //@RequestMapping("path", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/ex01")
    public String requestMethod(@RequestParam("id") String id,
            @RequestParam("pw") String pw,
            Model model) {
        model.addAttribute("id", id);
        model.addAttribute("pw", pw);
        return "pages/viewPage01"; // This maps to templates/pages/parameter/viewPage01.html
    }
}
