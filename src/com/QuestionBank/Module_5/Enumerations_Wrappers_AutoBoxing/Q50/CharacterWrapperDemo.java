package com.QuestionBank.Module_5.Enumerations_Wrappers_AutoBoxing.Q50;

public class CharacterWrapperDemo {
    public static void main(String[] args) {
        // Using Character wrapper to convert char to Character object
        char letter = 'A';
        Character charObject;
        charObject = Character.valueOf(letter);

        // Converting Character object to char
        char newLetter = charObject.charValue();

        System.out.println("Original char: " + letter);
        System.out.println("Converted to Character object: " + charObject);
        System.out.println("Converted back to char: " + newLetter);
    }
}

// The output of the above program is shown as below
/*
Original char: A
Converted to Character object: A
Converted back to char: A
 */