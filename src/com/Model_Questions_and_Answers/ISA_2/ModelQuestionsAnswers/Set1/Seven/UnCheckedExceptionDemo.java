package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set1.Seven;

/*
Unchecked Exceptions:
Unchecked exceptions, also known as runtime exceptions, are exceptions
that the compiler does not force you to catch.
They are subclasses of RuntimeException.
Examples include ArithmeticException, NullPointerException, etc.
 */
public class UnCheckedExceptionDemo {
    public static void main(String[] args) {
        int result;
        try {
            result = 10/0;
        }catch (ArithmeticException e1){
            System.out.println("Divide By Zero : "+ e1.getMessage());
            System.err.println("Divide By Zero : "+ e1.getMessage());
        }
    }
}

//The output of the above program is shown as below
/*
Divide By Zero : / by zero
Divide By Zero : / by zero
 */

/*
Common Exception Types:
ArithmeticException: Occurs when an arithmetic operation is performed with an illegal argument.
NullPointerException: Occurs when you try to access a member on an object that is null.
ArrayIndexOutOfBoundsException: Occurs when trying to access an array element with an illegal index.
Understanding and handling exceptions is crucial for writing robust and reliable Java programs.
 */