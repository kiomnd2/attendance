package practive.attendance.attendance.common.security.token;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TokenInfo {

    private String accessToken;
}
