package Lessons.Concepts.Constructors.Keywords.Static;

public class StaticBlockExample {
    static int rollNumber=1;
    static float marksJava= 89.0f;
    static String name="Vidyadhar";

    static {
        rollNumber += 1;
        System.out.println("static variables printing begins upon class initilization");
        System.out.println(rollNumber);
        System.out.println(marksJava);
        System.out.println(name);
        System.out.println("static variables printing ends");
    }

    public static void main(String[] args) {
        StaticBlockExample staticBlockObj1;
        staticBlockObj1 = new StaticBlockExample();

        System.out.println("rollnumber............:"+staticBlockObj1.rollNumber);
        System.out.println("Marks for Java........:"+staticBlockObj1.marksJava);
        System.out.println("name of the student...:"+staticBlockObj1.name);

        StaticBlockExample staticBlockObj2;
        staticBlockObj2 = new StaticBlockExample();

        System.out.println("rollnumber............:"+staticBlockObj2.rollNumber);
        System.out.println("Marks for Java........:"+staticBlockObj2.marksJava);
        System.out.println("name of the student...:"+staticBlockObj2.name);

    }

}
// The output of the above program is shown below:
/*
static variables printing begins upon class initilization
2
89.0
Vidyadhar
static variables printing ends
rollnumber............:2
Marks for Java........:89.0
name of the student...:Vidyadhar
rollnumber............:2
Marks for Java........:89.0
name of the student...:Vidyadhar
 */