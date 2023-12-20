package C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C3_03_String;

public class StringArrayDeclareDisplay {

    public static void main(String[] args) {

//        String[] stringArray;
//        stringArray = new String[4];
        String indElement = "Vidyadhar";
        System.out.println(indElement);
        for (int i = 0; i < indElement.length(); i++) {
            System.out.println(indElement.charAt(i));
        }

        String[] stringArray = {"Vidyadhar", "Poornima", "Atharva", "Akshara"};
        int i;
        for (i = 0; i < stringArray.length; i++) {
            System.out.println(i+"th element is"+stringArray[i]);
        }
    }
}
