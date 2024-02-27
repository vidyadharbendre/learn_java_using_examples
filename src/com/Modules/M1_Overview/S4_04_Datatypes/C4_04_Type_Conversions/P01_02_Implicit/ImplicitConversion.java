package com.Modules.M1_Overview.S4_04_Datatypes.C4_04_Type_Conversions.P01_02_Implicit;

/*
small size to bigger size - implicit
byte --> short --> int --> long --> float --> double
 */

public class ImplicitConversion {
    public static void main(String[] args) {
        // Implicit type conversion (Automatic Type Promotion)

        int numInt = 22; // int is converted to double implicitly
        float numFloat1 = 3.14f; // float is converted to double implicitly
        float numFloat2 = (float) 22 /7; // float is converted to double implicitly
        double numDouble1 = numInt; // Convert int to double (no data loss) - Implicit Conversion
        double numDouble2 = numFloat1; // Convert float to double (no data loss) - Implicit Conversion
        double numDouble3 = numFloat2; // Convert float to double (no data loss) - Implicit Conversion

        // Printing the results
        System.out.println("Implicit Type Conversion of int.....: " + numDouble1);
        System.out.println("Implicit Type Conversion of float...: " + numDouble2);
        System.out.println("Implicit Type Conversion of float...: " + numDouble3);
    }
}
// The output of the above program is shown as below
/*
Implicit Type Conversion of int.....: 22.0
Implicit Type Conversion of float...: 3.140000104904175
Implicit Type Conversion of float...: 3.142857074737549
 */
