package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Six;

/*
Apply the fundamental principles of exception handling in Java, focusing on
different types of exceptions and their handling mechanisms.
- checked
- unchecked
 */



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedDemo {

    public static void main(String[] args) {
        try {
            readFromFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    private static void readFromFile(String filename) throws IOException {
        String line;
        BufferedReader readerRefObj;
        readerRefObj = new BufferedReader(new FileReader(filename));
        line = readerRefObj.readLine();
        System.out.println("Read from file: " + line);
        readerRefObj.close();
    }
}

// The output of the above program is shown as below
/*
IOException caught: nonexistentfile.txt (No such file or directory)
 */