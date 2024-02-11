package modules.M3_Inheritance.S2_02_UsingSuper.C3_03_Accessing_ParentClass_Instance_Variable;


class Parent{

    int parentVar = 33;

}

class Child extends Parent{
    int childVar = 66;

    void displayVariables(){
        int parentValue = super.parentVar;
        int childValue = this.childVar;

        System.out.println("parentValue...: "+parentValue);
        System.out.println("childValue....: "+childValue);

        if (parentValue > childValue){
            System.out.println("Parent Values is Greater");
        }
        else {
            System.out.println("Child Values is greater or equal");
        }
    }
}



public class AccessingParentClassInstanceVariable {
    public static void main(String[] args) {
        Child childObj;
        childObj = new Child();
        childObj.displayVariables();
    }
}

// The output of the above program is shown as below:
/*
parentValue...: 33
childValue....: 66
Child Values is greater or equal
 */