package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C3_03_String;

public class StringArrayStaticDisplay {
    public static void main(String[] args) {
        String stringCharacters = "Vidyadhar";
        String[] stringArray = {"Vidyadhar", "Poornima", "Atharva", "Akshara"};
        displayCharacters(stringCharacters);
        displayArrayStrings(stringArray);

    }

    public static void displayCharacters(String fstringCharacters) {
        int fi;
        for (fi = 0; fi < fstringCharacters.length(); fi++) {
            System.out.println(fstringCharacters.charAt(fi));
        }

    }

    public static void displayArrayStrings(String[] fstringArray){
        int fi;
        for (fi = 0; fi < fstringArray.length; fi++) {
            System.out.println(fstringArray[fi]);
        }

    }

}

// The output of the above program is shown as below
/*
V
i
d
y
a
d
h
a
r
Vidyadhar
Poornima
Atharva
Akshara
 */