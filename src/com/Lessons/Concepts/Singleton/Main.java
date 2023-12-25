package Lessons.Concepts.Singleton;

public class Main {
    public static void main(String[] args) {

        // There is no way that you are allowed to create constructors
//        Singleton obj;
//        obj = new Singleton.getInstance();

        Singleton obj1;
        obj1 = Singleton.getInstance();

        Singleton obj2;
        obj2 = Singleton.getInstance();

        Singleton obj3;
        obj3 = Singleton.getInstance();
    }
}

// all 3 references obj1, obj2 and obj3 are pointing to only one object - singleton