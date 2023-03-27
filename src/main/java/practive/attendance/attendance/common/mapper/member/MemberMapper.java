package practive.attendance.attendance.common.mapper.member;

import org.mapstruct.Mapper;
import practive.attendance.attendance.common.mapper.EntityMapper;
import practive.attendance.attendance.domain.member.Member;
import practive.attendance.attendance.domain.member.MemberCommand;

@Mapper
public interface MemberMapper extends EntityMapper<MemberCommand, Member> { }
