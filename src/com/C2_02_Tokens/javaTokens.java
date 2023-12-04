/*
 * Program: JavaTokens
 *
 * Purpose:
 * This program serves as an illustrative example showcasing different tokens within Java programming.
 * It demonstrates various types of tokens such as keywords, data types, identifiers, literals, and symbols.
 *
 * The purpose of this program is to demonstrate the concept of tokens within Java programming.
 * It aims to showcase various types of tokens such as keywords, data types, identifiers, literals, and symbols
 * that construct Java code.
 *
 * Description:
 * The JavaTokens class contains a main method that displays examples of different tokens in Java.
 * It demonstrates the usage of tokens like data types, identifiers, literals, keywords, and symbols.
 * Comments within the code provide explanations regarding the role of each token in the program's structure.
 *
 *  Class Declaration:
 *   public class JavaTokens { ... }: Defines a Java class named JavaTokens.
 *   Main Method:
 *   public static void main(String[] args) { ... }: The main entry point of the Java program.
 *   Token Examples:
 *       int number = 42;: Demonstrates the usage of tokens such as:
 *       int: a data type token representing an integer.
 *       number: an identifier token serving as the name of a variable.
 *       42: a literal token representing an integer value.
 *       ;: a symbol token used to terminate the statement.
 *       System.out.println("Hello, World!");: Displays tokens like:
 *       System.out.println: a keyword token invoking a method to print to the console.
 *       ("Hello, World!"): a literal token representing a string message.
 *       ;: a symbol token terminating the statement.
 *
 *  Explaination:
 *
 *  The main method serves as the starting point of execution in Java programs.
 *  Comments within the code (// ...) provide explanations regarding different tokens used in Java, illustrating
 *  their roles within the program's structure.
 *  The program showcases basic token types, emphasizing their significance in constructing Java code and representing fundamental units within the language.
 *
 */
package C2_02_Tokens.S2_02_Datatypes;
public class javaTokens {
    public static void main(String[] args) {
        // Examples of tokens in Java

        // Example 1: int data type, identifier, literal, and symbol tokens
        int number = 42;  // 'int' is a data type token, 'number' is an identifier token,
        // '42' is a literal token, and ';' is a symbol token

        // Example 2: System.out.println keyword, literal, and symbol tokens
        System.out.println("Hello, World!");  // 'System.out.println' is a keyword token,
        // '("Hello, World!")' is a literal token, and ';' is a symbol token
    }
}
