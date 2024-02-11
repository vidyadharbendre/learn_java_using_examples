package com.Modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E2_Cooking_Receipes {
    public static void main(String[] args) {
        PastaRecipe pastaRecipeRefObj;
        pastaRecipeRefObj = new PastaRecipe();

        // Example Usage:
        pastaRecipeRefObj.prepareIngredients();
        pastaRecipeRefObj.cook();
        pastaRecipeRefObj.serve();
    }
}

abstract class Recipe {
    abstract void prepareIngredients();
    abstract void cook();
    abstract void serve();
}

class PastaRecipe extends Recipe {
    @Override
    void prepareIngredients() {
        // Pasta-specific implementation
        System.out.println("Prepare Pasta Ingredients");
    }

    @Override
    void cook() {
        // Pasta-specific implementation
        System.out.println("Cooking Pasta");
    }

    @Override
    void serve() {
        // Pasta-specific implementation
        System.out.println("Serve Delicious Pasta");
    }
}

// The output of the above program is shown as below
/*

Prepare Pasta Ingredients
Cooking Pasta
Serve Delicious Pasta

 */