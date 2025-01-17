package com.mobile.integration.grandstores.ExceptionHandler;
import com.mobile.integration.grandstores.Utils.ResponseAPI.APIResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity handleException(Exception e){

        APIResponse apiResponse = new APIResponse();
        apiResponse.setError("Oops..Something went wrong!"+e.toString());
        apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(apiResponse);
    }

    // @ExceptionHandler
    // public ResponseEntity handleBadRequestException(BadRequestException e){

    //     APIResponse apiResponse = new APIResponse();
    //     apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
    //     apiResponse.setError(e.getErrors());

    //     return ResponseEntity.status(400).body(apiResponse);
    // }

    @ExceptionHandler
    public ResponseEntity handleAccessDeniedException(AccessDeniedExcep e){

        APIResponse apiResponse = new APIResponse();
        apiResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
        // System.out.println("==>>"+e);
        // System.out.println("=<<=>>>>"+e.toString());
        apiResponse.setError("Access Denied");

        return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
    }



}