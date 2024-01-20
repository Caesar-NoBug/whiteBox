package org.caesar.domain.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ErrorCode {
    //TODO: 根据标准的http状态码改一下
    SUCCESS(200, "Request Success"),
    INVALID_ARGS_ERROR(400, "Invalid argument"),
    NOT_AUTHENTICATED_ERROR(401, "Unauthenticated"),
    NOT_AUTHORIZED_ERROR(402, "Unauthorized"),
    TOO_MUCH_REQUEST_ERROR(429, "To Many Request"),
    NOT_FIND_ERROR(404, "Resource Could Not Found"),
    ALREADY_EXIST_ERROR(405, "Data Already Exist"),
    DUPLICATE_REQUEST(406, "Duplicate Request"),
    SYSTEM_ERROR(500, "Unexpected System Error"),
    SERVICE_UNAVAILABLE_ERROR(501, "Service Unavailable");

    private final int code;

    private final String message;

    public static ErrorCode getErrorCode(int code) {
        for (ErrorCode errorCode : values()) {
            if (errorCode.getCode() == code) {
                return errorCode;
            }
        }
        return null;
    }

}
