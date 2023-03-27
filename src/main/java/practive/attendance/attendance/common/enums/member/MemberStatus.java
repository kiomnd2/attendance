package practive.attendance.attendance.common.enums.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberStatus {
    ENABLE("활성화"), DISABLE("비활성화");
    private final String description;
}
