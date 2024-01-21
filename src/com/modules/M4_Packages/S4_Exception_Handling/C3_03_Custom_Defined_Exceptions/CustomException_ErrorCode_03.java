package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Custom_Defined_Exceptions;

/*
Author:
Vidyadhar Bendre

Email:
vidyadhar.bendre@gmail.com

Explanation:
Main Class: CustomException_ErrorCode_03:

The main method is the entry point of the program.
Inside the try block, a new instance of MyExceptionErrorCode is created and thrown.
This instance is initialized with the message "Resource Not Found" and the error code 404.
Custom Exception Class: MyExceptionErrorCode:

This class extends the built-in Exception class, making it a checked exception.
It has a private field, errorCode, to store the error code associated with the exception.
Constructor of MyExceptionErrorCode:

The constructor takes two parameters: a message and an error code.
The super(message) call invokes the constructor of the superclass (Exception) with the provided message.
The error code is set using this.errorCode = errorCode.
Getter Method: getErrorCode:

This method allows access to the private errorCode field by providing a way to retrieve its value.
main Method - Throwing and Catching the Exception:

The main method throws an instance of MyExceptionErrorCode with the message "Resource Not Found" and the error code 404.
The exception is caught in the catch block, and the message is printed using e1.getMessage().
Note that you can also access the error code using the getErrorCode method.
 */

public class CustomException_ErrorCode_03 {
    public static void main(String[] args) {
        try{

            throw new MyExceptionErrorCode("Resource Not Found", 404);

        }catch (MyExceptionErrorCode e1){
            System.out.println(e1.getMessage());

        }
    }
}

class MyExceptionErrorCode extends Exception{
    private int errorCode;
    public MyExceptionErrorCode(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
}

// The output of the above code is shown as below:
/*
Resource Not Found
 */