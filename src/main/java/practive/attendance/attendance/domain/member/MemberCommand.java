package practive.attendance.attendance.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class MemberCommand {
    private final String memberId;
    private final String registerNo;
    private final String email;
    private final String password;
}
