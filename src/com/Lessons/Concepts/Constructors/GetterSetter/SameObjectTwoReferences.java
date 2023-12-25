package Lessons.Concepts.Constructors.ClassAndConstructor.GetterSetter;

public class SameObjectTwoReferences {
    private int variable1;

    SameObjectTwoReferences(){
        this.variable1 = 100;
    }

    SameObjectTwoReferences(int newVariable1){
        this.variable1 = newVariable1;
    }

    public void setVariable1(int updateVariable){
        this.variable1 = updateVariable;
    }

    public int getVariable1(){
        return variable1;
    }

    public static void main(String[] args) {
        SameObjectTwoReferences firstObj;
        firstObj = new SameObjectTwoReferences();

        System.out.println("Default Variable1...: "+firstObj.variable1);

        SameObjectTwoReferences secondObj;
        secondObj = firstObj;

        System.out.println("Printing Default Through secondObj...: "+secondObj.variable1);

        SameObjectTwoReferences thirdObj;
        thirdObj = new SameObjectTwoReferences(911);

        System.out.println("Printing Third Object...: "+thirdObj.variable1);
        secondObj = thirdObj;
        System.out.println(secondObj.variable1);
        thirdObj.setVariable1(688);
        System.out.println("Updated Value through SetMethod...:"+thirdObj.variable1);
        System.out.println("Retrieve the variable through get method...:"+thirdObj.getVariable1());
    }
}
