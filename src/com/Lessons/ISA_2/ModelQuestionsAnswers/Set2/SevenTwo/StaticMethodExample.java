package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.SevenTwo;

/*



 */


public class StaticMethodExample {
    public static void main(String[] args) {
        int resultAdd, resultSubtract;

        resultAdd = MathOperation.add(33,66);
        resultSubtract = MathOperation.subtract(99, 66);

        System.out.println("Addition : "+resultAdd);
        System.out.println("Subtraction : "+resultSubtract);
    }
}

interface MathOperation{
    static int add(int a, int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
}
