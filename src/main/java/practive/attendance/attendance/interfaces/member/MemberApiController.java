package practive.attendance.attendance.interfaces.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practive.attendance.attendance.application.member.MemberFacade;
import practive.attendance.attendance.common.response.CommonResponse;
import practive.attendance.attendance.domain.member.MemberCommand;
import practive.attendance.attendance.domain.member.MemberInfo;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberApiController {

    private final MemberFacade memberFacade;

    @PostMapping("/signup")
    public CommonResponse<MemberDto.SignupResponse> signup(@RequestBody @Valid MemberDto.SignupRequest request) {
        MemberCommand memberCommand = request.toCommand();
        MemberInfo memberInfo = memberFacade.registerMember(memberCommand);
        return CommonResponse.ofSuccess(new MemberDto.SignupResponse(memberInfo));
    }

}
