package modules.M3_Inheritance.S2_02_UsingSuper.C4_04_Invoking_ParentClass_Overridden_Method;

class Parent{
    void display(){
        System.out.println("Parent Class Method");
    }
}

class Child extends Parent{
    @Override
    void display() {
        super.display();
        System.out.println("Child Class Method");
    }
}
public class InvokingParentClassOverriddenMethod {

    public static void main(String[] args) {
        Child childObj;
        childObj = new Child();

        childObj.display();

    }
}
