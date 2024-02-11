package modules.M3_Inheritance.S2_02_UsingSuper.C5_05_Accessing_ParentClass_From_Nested_InnerClass;

class Parent{
    int num = 100;

    class Inner{
        int num = 10;
        void display(){
            System.out.println("Parent num: " + Parent.this.num);// Accessing Parent Class variable from Inner Class
            System.out.println("Inner  num: " + this.num);// Accessing Class variable from Inner Class
        }
    }
}
public class AccessingParentClassFromNestedClass {

    public static void main(String[] args) {
        Parent parentObj;
        parentObj = new Parent();

        Parent.Inner innerObj;
        innerObj = parentObj.new Inner();

        innerObj.display();
    }


}
