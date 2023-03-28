package practive.attendance.attendance.application.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practive.attendance.attendance.domain.member.MemberCommand;
import practive.attendance.attendance.domain.member.MemberInfo;
import practive.attendance.attendance.domain.member.MemberService;

@RequiredArgsConstructor
@Service
public class MemberFacade {
    private final MemberService memberService;

    public MemberInfo registerMember(MemberCommand memberCommand) {
        return memberService.registerMember(memberCommand);
    }
}
