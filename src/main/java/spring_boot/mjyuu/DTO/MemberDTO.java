package spring_boot.mjyuu.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MemberDTO {
    private long id; // primary key for member
    private String name;
    private String email;
}
