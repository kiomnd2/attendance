package practive.attendance.attendance.domain.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import practive.attendance.attendance.common.enums.member.MemberStatus;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String memberToken;
    private String memberId;
    private String memberName;
    private String registerNo;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

}
