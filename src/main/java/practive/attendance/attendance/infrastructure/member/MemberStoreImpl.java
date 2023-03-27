package practive.attendance.attendance.infrastructure.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import practive.attendance.attendance.domain.member.Member;
import practive.attendance.attendance.domain.member.MemberStore;

@RequiredArgsConstructor
@Component
public class MemberStoreImpl implements MemberStore {
    private final MemberRepository memberRepository;

    @Override
    public Member store(Member member) {
        return memberRepository.save(member);
    }
}
