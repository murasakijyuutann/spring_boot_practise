package spring_boot.mjyuu.controller.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String showBoardPage(@PathVariable int boardId, Model model) {

        model.addAttribute("boardId", boardId);
        return "pages/board"; // This maps to templates/pages/board.html
    }
    
}
