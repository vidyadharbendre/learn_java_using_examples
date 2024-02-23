package com.Modules.M5_MultiThreading.S13_Enumerations;

enum HttpStatusCode{
    OK(),
    NOT_FOUND,
    INTERNAL_SERVER_ERROR();

    private int error_code;

    HttpStatusCode() {
        this.error_code = 404;
        System.out.println("Setting Default Values");
    }
    HttpStatusCode(int error_code) {
        this.error_code = error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public int getError_code() {
        return error_code;
    }
}

public class Enum_Example_0 {
    public static void main(String[] args) {
        HttpStatusCode httpStatusCode;

        httpStatusCode = HttpStatusCode.OK;
        System.out.println("OK: "+httpStatusCode.getError_code());

        httpStatusCode = HttpStatusCode.NOT_FOUND;
        System.out.println("NOT_FOUND: "+httpStatusCode.getError_code());

        httpStatusCode = HttpStatusCode.INTERNAL_SERVER_ERROR;
        System.out.println("INTERNAL_SERVER_ERROR: "+httpStatusCode.getError_code());

        httpStatusCode.setError_code(500);
        System.out.println("INTERNAL_SERVER_ERROR: "+httpStatusCode.getError_code());

        httpStatusCode = HttpStatusCode.OK;
        httpStatusCode.setError_code(200);
        System.out.println("OK: "+httpStatusCode.getError_code());


    }
}

// The output of the above program is shown as below
/*
Setting Default Values
Setting Default Values
Setting Default Values
OK: 404
NOT_FOUND: 404
INTERNAL_SERVER_ERROR: 404
INTERNAL_SERVER_ERROR: 500
OK: 200
 */