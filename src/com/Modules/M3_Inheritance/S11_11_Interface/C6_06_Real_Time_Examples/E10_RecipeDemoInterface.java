package com.Modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

public class E10_RecipeDemoInterface {
    public static void main(String[] args) {
        Cake cakeRefObj;
        cakeRefObj = new Cake();

        cakeRefObj.prepareIngredients();
        cakeRefObj.cook();
        cakeRefObj.serve();
        cakeRefObj.bakeInOven();

    }
}

interface RecipeBase{
    abstract void prepareIngredients();
    abstract void cook();
    abstract void serve();

}

interface Baking{
    abstract void bakeInOven();
}

class Cake implements RecipeBase, Baking{
    @Override
    public void prepareIngredients() {
        System.out.println("Prepare ingredients");
    }

    @Override
    public void cook() {
        System.out.println("cook it");

    }

    @Override
    public void serve() {
        System.out.println("serve it");
    }

    @Override
    public void bakeInOven(){
        System.out.println("Bake in Oven");
    }
}


