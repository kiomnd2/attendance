package practive.attendance.attendance.interfaces.member;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import practive.attendance.attendance.domain.member.MemberCommand;
import practive.attendance.attendance.domain.member.MemberInfo;

public class MemberDto {

    @Getter
    @Setter
    @ToString
    public static class SignupRequest {

        @NotEmpty(message = "memberId는 필수값 입니다.")
        private String memberId;

        @NotEmpty(message = "registerNo는 필수값 입니다.")
        private String registerNo;

        @NotEmpty(message = "password는 필수값 입니다.")
        private String password;

        @Email(message = "이메일 형식에 맞아야 합니다")
        @NotEmpty(message = "email은 필수값 입니다.")
        private String email;

        public MemberCommand toCommand() {
            return MemberCommand.builder()
                    .memberId(memberId)
                    .password(password)
                    .email(email)
                    .registerNo(registerNo)
                    .build();
        }
    }

    @RequiredArgsConstructor
    @Getter
    @ToString
    public static class SignupResponse {
        private final String memberToken;
        private final String memberId;
        private final String registerNo;
        private final String email;

        public SignupResponse(MemberInfo memberInfo) {
            this.memberToken = memberInfo.getMemberToken();
            this.memberId = memberInfo.getMemberId();
            this.registerNo = memberInfo.getRegisterNo();
            this.email = memberInfo.getEmail();
        }
    }
}
