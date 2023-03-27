package practive.attendance.attendance.domain.member;

import lombok.Getter;
import practive.attendance.attendance.common.enums.member.MemberStatus;

@Getter
public class MemberInfo {
    private final Long id;
    private final String memberToken;
    private final String memberId;
    private final String memberName;
    private final String registerNo;
    private final String email;
    private final MemberStatus status;

    public MemberInfo(Member store) {
        this.id = store.getId();
        this.memberToken = store.getMemberToken();
        this.memberId = store.getMemberId();
        this.memberName = store.getMemberName();
        this.registerNo = store.getRegisterNo();
        this.email = store.getEmail();
        this.status = store.getStatus();
    }
}
