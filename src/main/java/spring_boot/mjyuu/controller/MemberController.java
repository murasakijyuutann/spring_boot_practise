package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import spring_boot.mjyuu.repository.MemberRepository;
import spring_boot.mjyuu.DTO.MemberDTO; // ✅ Correct DTO

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberRepository memRepo;

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("member", new MemberDTO()); // ✅ now matches your HTML
        return "member/addForm";
    }
}
