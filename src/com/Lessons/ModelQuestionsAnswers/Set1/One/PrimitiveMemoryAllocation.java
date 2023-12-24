package Lessons.ModelQuestionsAnswers.Set1.One;

public class PrimitiveMemoryAllocation {

    public static void main(String[] args) {
        // Declaration and initialization of variables
        byte myByte = 100;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 1000000000L;
        float myFloat = 10.5f;
        double myDouble = 10.543;
        char myChar = 'A';
        boolean myBoolean = true;

        // Displaying values and their memory sizes
        System.out.println("byte: " + myByte);
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");

        System.out.println("short: " + myShort);
        System.out.println("Size of short: " + Short.BYTES + " bytes");

        System.out.println("int: " + myInt);
        System.out.println("Size of int: " + Integer.BYTES + " bytes");

        System.out.println("long: " + myLong);
        System.out.println("Size of long: " + Long.BYTES + " bytes");

        System.out.println("float: " + myFloat);
        System.out.println("Size of float: " + Float.BYTES + " bytes");

        System.out.println("double: " + myDouble);
        System.out.println("Size of double: " + Double.BYTES + " bytes");

        System.out.println("char: " + myChar);
        System.out.println("Size of char: " + Character.BYTES + " bytes");

        System.out.println("boolean: " + myBoolean);
        System.out.println("Size of boolean: Not defined (JVM specific)");

        // Example to demonstrate runtime memory allocation
        int num = 10; // Allocated in stack memory
        System.out.println("Runtime memory allocation for int: " + num);
    }
}

// The output of the above program is shown as below:
/*
byte: 100
Size of byte: 1 bytes
short: 1000
Size of short: 2 bytes
int: 100000
Size of int: 4 bytes
long: 1000000000
Size of long: 8 bytes
float: 10.5
Size of float: 4 bytes
double: 10.543
Size of double: 8 bytes
char: A
Size of char: 2 bytes
boolean: true
Size of boolean: Not defined (JVM specific)
Runtime memory allocation for int: 10

 */