package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.EightTwo.Geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
