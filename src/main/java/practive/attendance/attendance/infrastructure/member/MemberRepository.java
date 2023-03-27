package practive.attendance.attendance.infrastructure.member;

import org.springframework.data.jpa.repository.JpaRepository;
import practive.attendance.attendance.domain.member.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
