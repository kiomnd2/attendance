package practive.attendance.attendance.domain.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import practive.attendance.attendance.common.mapper.member.MemberMapper;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberStore memberStore;
    private final MemberMapper mapper;

    @Override
    public MemberInfo registerMember(MemberCommand memberCommand) {
        Member store = memberStore.store(mapper.toEntity(memberCommand));
        return new MemberInfo(store);
    }
}
