package com.crud.application.enums;

public enum Error {

    AUTHENTICATION_ERROR("1", "Invalid access token"),
    INTERNAL_SERVER_ERROR("2", "Something wrong happened with the application. Please try again later."),
    REQUIRED_FIELDS_MISSING("3", "Required fields are missing. "),

    // User related
    EMAIL_ALREADY_USED("4","Email address is already used"),
    NUMBER_ALREADY_USED("5", "Phone Number is already used"),
    EMAIL_NOT_EXIST("6", "Email address doesn't exist."),
    USER_NOT_EXIST("6", "User doesn't exist."),
    PHONE_NUMBER_NOT_EXIST("7","Phone number doesn't exist"),
    WRONG_CREDENTIALS("8", "Wrong email or password"),

    //BookingConstant related
    BOOKING_CANCELLED("9","booking is cancelled"),
    BOOKING_NOT_EXIST("10","Booking doesn't exist"),
    BOOKINGS_NOT_FOUND("10","Bookings not found"),

    //Database related
    DATABASE_SAVE_FAIL("11", "Failed to save in Database"),

    //Verification Code related
    VERIFICATION_CODE_EXPIRED("12","Verification code has expired"),
    VERIFICATION_CODE_USED("13","Verification code has been used"),
    VERIFICATION_CODE_INCORRECT("14","Verification code doesn't exist"),

    //EMAIL_SENDING
    EMAIL_SENDING_FAILED("15","Email sending failed"),

    SMS_SENDING_FAILED("20","SMS sending failed"),

    //FLIGHT_DATA
    AIRLINE_NAME_UNAVAILABLE("16","Airline's name is not available"),

    //ServiceArea
    SERVICE_AREA_NOT_FOUND("17","Service area not found"),
    CHANGE_BOOKING_TIME("18","Change booking time"),
    WRONG_OPS_PORTER("19","Wrong OPS Porter"),


    USER_NOT_ACTIVE("20","user is not active"),
    REQUEST_NULL("21","Request is null"),
    DRIPORTER_NOT_ASSIGNED("22","No driporter assigned to this booking"),
    BOOKING_ALREADY_CANCELLED("SC-23","Booking is cancelled"),
    DRIPORTTER_ONJOB_STATUS_UPDATE_FAILED("SC-24","Porter On Job Cannot Update Status"),

    VEHICLE_NOT_FOUND("SC-24","Vehicle not found"),
    HANDSHAKE_AT_INVALID_STATUS("SC-25","Cannot handshake. Invalid status."),
    BOOKING_STATUS_UPDATE_FAILED("SC-26","Booking status cannot be updated" ),
    PORTER_STATUS_VEHICLE_ASSIGN_FAILED("SC-27","Porter is On Job, Vehicle cannot be assigned "),
    VEHICLE_NOT_AVAILABLE("SC-28","Vehicle is already occupied") ,

    ERROR_WHILE_UPLOADING_DOCUMENT("SC-29","Error while uploading document"),

    VEHICLE_IN_ACTIVE("SC-30","Vehicle is inactive."),

    USER_NOT_LOGGED_IN("SC-32","User is not logged in"),

    NO_SCREEN_OR_SCREEN_STATUS_FOUND("SC-33","No screen or screen status found with this name"),

    PARSING_ERROR("SC-34","Error in parsing data"),

    RATING_CAN_NOT_BE_GREATER_THAN_FIVE("SC-35","Rating can not be greater than 5"),

    USER_CAN_NOT_ACCESS("SC-36","User can not access"),
    USER_TYPE_IS_NOT_CORRECT("SC-37","User type is not correct"),
    DUPLICATE_PROMOCODE("SC-39","Your Promocode is duplicate."),
    REGION_NOT_FOUND("SC-40","Region is not found"),
    INVALID_PROMO_CODE("SC-41","Your Promocode is invalid"),
    DATE_PARSE_ERROR("SC-40","Your date has wrong format"),
    WRONG_PAYMENT_TYPE("SC-40","Wrong payment type"),
    BOOKING_STATUS_IS_NOT_PAYMENT_PENDING("SC-41","Booking status is not payment pending"),
    BATCH_NOT_ASSIGNED_TO_THIS_USER("SC-42","No batch found for this user"),
    PAYFORT_API_FAILED("SC-43","PayFort API Failed"),
    NO_CREDIT_CARD_FOUND("SC-44","No credit cards found"),
    CARD_EXISTS("SC-45","Card is already added"),
    CARD_NOT_EXISTS("SC-46","Invalid Card"),
    REPORT_GENERATION_FAILED("SC-47","Report generation failed, files is not generating"),
    REPORT_LOADING_FAILED("SC-47","Report loading failed"),
    FILE_GENERATION_FAILED("SC-48","File generation failed"),
    PAYMENT_ALREADY_DONE("SC-49","Payment is already completed"),
    OLD_PASSWORD_MISMATCHED("SC-49","Old Password Mismatched"),
    USER_CREATION_FAILED("SC-49","Airport terminal doesn't exist"),
    LARGER_FILE_SIZE("SC-50","File size is larger than 3 mb"),
    PASSENGER_ALREADY_EXISTS("SC-51","Passenger already exists"),
    CURRENCY_CONVERSION_FAIL("SC-52","Cannot get Converted Currency");


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
