package practive.attendance.attendance.infrastructure.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import practive.attendance.attendance.domain.member.Member;
import practive.attendance.attendance.domain.member.MemberStore;

@RequiredArgsConstructor
@Component
public class MemberStoreImpl implements MemberStore {
    private final MemberRepository memberRepository;
    @Transactional
    @Override
    public Member store(Member member) {
        return memberRepository.save(member);
    }
}
