package practive.attendance.attendance.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T>{
    private Result result;
    private T data;
    private String errorCode;

    public static <T> CommonResponse<T> ofSuccess(T body) {
        return new CommonResponse<>(Result.SUCCESS, body, null);
    }
    public static <T> CommonResponse<T> ofFail(T message, ErrorCode code) {
        return new CommonResponse<>(Result.FAIL, message, code.name());
    }

    public enum Result {
        SUCCESS, FAIL
    }
}
