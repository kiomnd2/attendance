package practive.attendance.attendance.infrastructure.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import practive.attendance.attendance.common.security.JwtTokenProvider;
import practive.attendance.attendance.domain.member.Member;
import practive.attendance.attendance.domain.member.MemberStore;

@RequiredArgsConstructor
@Component
public class MemberStoreImpl implements MemberStore, UserDetailsService {
    private final MemberRepository memberRepository;
    private final JwtTokenProvider provider;
    @Transactional
    @Override
    public Member store(Member member) {

        return memberRepository.save(member);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
