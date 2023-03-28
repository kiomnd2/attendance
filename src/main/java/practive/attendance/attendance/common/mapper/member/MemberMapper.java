package practive.attendance.attendance.common.mapper.member;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import practive.attendance.attendance.common.mapper.EntityMapper;
import practive.attendance.attendance.domain.member.Member;
import practive.attendance.attendance.domain.member.MemberCommand;

@Mapper
public interface MemberMapper extends EntityMapper<MemberCommand, Member> {
    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);
}
