package spring_boot.mjyuu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import spring_boot.mjyuu.DTO.MemberDTO;

@Repository
public class MemberRepository {
    private List<MemberDTO> memberList = new ArrayList<>();
    private long sequence = 0L;

    public MemberDTO save(MemberDTO memberDTO) {
        memberDTO.setId(++sequence); // simulate auto-incremented ID
        memberList.add(memberDTO);
        return memberDTO;
    }

    public List<MemberDTO> findAll() {
        return memberList;
    }
}
