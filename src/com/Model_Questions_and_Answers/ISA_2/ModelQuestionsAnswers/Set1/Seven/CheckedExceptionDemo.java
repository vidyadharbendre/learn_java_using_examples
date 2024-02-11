package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set1.Seven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Exception Handling in Java:
Exception handling in Java is a mechanism to deal with runtime errors.
It helps in maintaining the normal flow of the program and prevents
abrupt termination.

Exceptions can be of two types:
checked exceptions
and
unchecked exceptions.

Checked Exceptions:
Checked exceptions are exceptions that the compiler forces you to catch. They are subclasses of Exception (excluding RuntimeException and its subclasses). Examples include IOException, SQLException, etc.
 */

public class CheckedExceptionDemo {
    public static void main(String[] args) {

        try {
            // Code that may throw a checked exception
            File fileRefObj;
            fileRefObj = new File("example.txt");

            Scanner scannerRefObj;
            scannerRefObj = new Scanner(fileRefObj);

        }catch (FileNotFoundException e1){
            // Handle the exception
            System.out.println("File Not Found : "+e1.getMessage());
        }
    }
}
