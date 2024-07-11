package com.Trials.LearnBasics;

public class DefaultConstructor {
    private int attribute;

    public DefaultConstructor(){
        attribute = 99;
    }

    public static void main(String[] args) {
        DefaultConstructor defObj;
        defObj = new DefaultConstructor();

        System.out.println("The default value of the attribute is : "+ defObj.attribute);
    }

}
