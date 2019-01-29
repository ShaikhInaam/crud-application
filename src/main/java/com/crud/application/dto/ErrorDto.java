package com.crud.application.dto;

import lombok.Data;
import com.crud.application.enums.Error;

@Data
public class ErrorDto {

    private String errorCode;
    private String errorMessage;
    private String errorDetails;

    public ErrorDto() {}

    public ErrorDto(String errorCode, String errorMessage, String errorDetails) {

        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
    }

    public ErrorDto(Error error) {

        this.errorCode = error.getCode();
        this.errorMessage = error.getMessage();
        this.errorDetails = error.getMessage();
    }

    public ErrorDto(Error error, String errorDetails) {

        this.errorCode = error.getCode();
        this.errorMessage = error.getMessage();
        this.errorDetails = errorDetails;
    }

    @Override
    public String toString() {

        return "ErrorDto [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", errorDetails=" + errorDetails + "]";
    }

}
