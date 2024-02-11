package Lessons.Concepts.InnerClasses;

public class InnerClassExample {
    static class InnerClass{
        public static double world_population;
        public InnerClass(){
            this.world_population = 6_000_000_000.0;
        }
        public InnerClass(double world_population) {
            InnerClass.world_population = world_population;
        }
    }
    public static void main(String[] args) {

        InnerClass obj1;
        obj1 = new InnerClass();
        System.out.println(obj1.world_population);

        InnerClass obj2;
        obj2 = new InnerClass(7_000_000_000.0);
        System.out.println(obj2.world_population);

        InnerClass obj3;
        obj3 = new InnerClass(8_000_000_000.0);
        System.out.println(obj3.world_population);
    }
}
// The output of the above program is shown as below:
/*
6.0E9
7.0E9
8.0E9
 */

