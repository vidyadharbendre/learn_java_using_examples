package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.EightTwo.Geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
