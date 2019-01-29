package com.crud.application.enums;

public enum Error {

    INTERNAL_SERVER_ERROR("2", "Something wrong happened with the application. Please try again later."),
    REQUIRED_FIELDS_MISSING("3", "Required fields are missing. "),

    NUMBER_ALREADY_USED("5", "Phone Number is already used"),
    USER_NOT_EXIST("6", "User doesn't exist.");

    private final String code;
    private final String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
