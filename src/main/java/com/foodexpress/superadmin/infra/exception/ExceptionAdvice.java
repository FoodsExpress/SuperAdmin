package com.foodexpress.superadmin.infra.exception;


import static com.foodexpress.superadmin.modules.utils.ApiUtils.fail;

import com.foodexpress.superadmin.modules.utils.ApiUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {

    private ResponseEntity<ApiUtils.ApiResult<?>> newResponse(Throwable throwable, HttpStatus status) {
        return newResponse(throwable.getMessage(), status);
    }

    private ResponseEntity<ApiUtils.ApiResult<?>> newResponse(String message, HttpStatus status) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<>(fail(message, status), headers, status);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ApiUtils.ApiResult<?>> defaultException(Exception e) {
        log.error("defaultException : {} ", e.getMessage());
        e.printStackTrace();
        return newResponse(e, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(OmittedRequireFieldException.class)
    protected ResponseEntity<ApiUtils.ApiResult<?>> handleOmittedRequireFieldException(OmittedRequireFieldException omittedRequireFieldException) {
        return newResponse(omittedRequireFieldException, HttpStatus.FORBIDDEN);
    }

}
