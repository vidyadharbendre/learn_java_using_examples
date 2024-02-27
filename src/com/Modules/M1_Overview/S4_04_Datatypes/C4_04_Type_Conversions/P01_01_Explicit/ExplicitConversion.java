package com.Modules.M1_Overview.S4_04_Datatypes.C4_04_Type_Conversions.P01_01_Explicit;

/*
bigger size to smaller size - explicit
double --> float --> long --> int --> short --> byte
 */

public class ExplicitConversion {
    public static void main(String[] args) {
        // Explicit type conversion (Narrowing Conversion)

        double numDouble1 = 22.0; // double is converted to int explicitly
        double numDouble2 = 3.14; // double is converted to float explicitly
        double numDouble3 = 3.142857; // double is converted to float explicitly
        int numInt = (int) numDouble1; // Convert double to int explicitly - Narrowing Conversion
        float numFloat1 = (float) numDouble2; // Convert double to float explicitly - Narrowing Conversion
        float numFloat2 = (float) numDouble3; // Convert double to float explicitly - Narrowing Conversion

        // Printing the results
        System.out.println("Explicit Type Conversion of double to int.....: " + numInt);
        System.out.println("Explicit Type Conversion of double to float...: " + numFloat1);
        System.out.println("Explicit Type Conversion of double to float...: " + numFloat2);
    }
}
// The output of the above program is shown as below
/*
Explicit Type Conversion of double to int.....: 22
Explicit Type Conversion of double to float...: 3.14
Explicit Type Conversion of double to float...: 3.142857 */
