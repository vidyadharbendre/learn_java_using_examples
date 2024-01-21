package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Types.E1_01_Checked;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Checked_IOException {
    public static void main(String[] args) {
        File fileRefObj;
        fileRefObj = new File("example.txt");

        try {
            FileReader fileReaderRefObj;
            fileReaderRefObj = new FileReader(fileRefObj);
        }catch (IOException e1){
            System.out.println(e1.getMessage());
        }

    }
}
