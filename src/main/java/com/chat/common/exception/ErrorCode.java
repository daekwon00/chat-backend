package com.chat.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // --- 인증/인가 ---
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "AUTH001", "인증이 필요합니다"),
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "AUTH002", "유효하지 않은 토큰입니다."),
    EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "AUTH003", "만료된 토큰입니다"),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "AUTH004", "접근 권한이 없습니다"),

    // --- 공통 ---
    INVALID_INPUT(HttpStatus.BAD_REQUEST, "COMMON001", "잘못된 입력입니다"),
    RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND, "COMMON002", "리소스를 찾을 수 없습니다"),
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON003", "서버 오류가 발생했습니다");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
