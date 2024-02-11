package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S02_UserDefined;

public class UserDefinedException_00 {
    public static void main(String[] args) {
        try{
            throw new UserDefinedException(99);

        }catch (Exception e){
            System.out.println(e);

        }
    }
}


class UserDefinedException extends Exception{
    private int code;

    public UserDefinedException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String toString(){
        return("Exception Code : "+getCode());
    }

}

// The output of the above program is shown as below:
/*
Exception Code : 99
 */