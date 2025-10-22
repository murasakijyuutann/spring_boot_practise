package spring_boot.mjyuu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import spring_boot.mjyuu.repository.MemberRepository;
import spring_boot.mjyuu.DTO.MemberDTO;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberRepository memRepo;

    // ① Display form at /add
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("member", new MemberDTO()); // Binds form to MemberDTO
        return "member/addForm"; // form path
    }

    // ② Handle form submission (POST to /add)
    @PostMapping("/add")
    public String processLogin(@ModelAttribute("member") MemberDTO memberDTO, Model model) {
        MemberDTO savedMember = memRepo.save(memberDTO); // Save to in-memory repo

        // You can also pass the saved member to the next page if needed
        model.addAttribute("savedMember", savedMember);
        return "redirect:/members"; // success page (create welcome.html later)
    }

    // ③ Optional: View all members (like user list)
    @GetMapping("/members")
    public String showMembers(Model model) {
        model.addAttribute("memberList", memRepo.findAll());
        return "member/members"; // create member/members.html if needed
    }
}
