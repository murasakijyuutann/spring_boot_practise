package spring_boot.mjyuu.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder // Generates builder pattern code
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
 
    private String id;
    private String email;
    private String pw;
}
