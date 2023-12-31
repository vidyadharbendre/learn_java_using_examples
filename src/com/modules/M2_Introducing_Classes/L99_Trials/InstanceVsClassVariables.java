package modules.M2_Introducing_Classes.L99_Trials;

public class InstanceVsClassVariables {

    public double r, x, y;

    static int circleCount = 0; //class variable as declared as static

    public InstanceVsClassVariables() {
        this.r = 0;
        this.x = 0;
        this.y = 0;

        circleCount++;
    }

    public InstanceVsClassVariables(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
        circleCount++;
    }

//    public void InstanceVsClassVariables(){
//        this(0, 0, 0.1);
//        circleCount++;
//    }

    public double calCircumference() {
        return (2 * 3.14 * r);
    }

    public InstanceVsClassVariables(InstanceVsClassVariables other) {
        this.r = other.r;
        this.x = other.x;
        this.y = other.y;
        circleCount++;
    }

    public static void main(String[] args) {

        InstanceVsClassVariables insClaVarObj1;
        insClaVarObj1 = new InstanceVsClassVariables();
        System.out.println("C1 : "+circleCount);

        InstanceVsClassVariables insClaVarObj2;
        insClaVarObj2 = new InstanceVsClassVariables(5, 4, 3);
        System.out.println("C2 : "+circleCount);

        InstanceVsClassVariables insClaVarObj3;
        insClaVarObj3 = new InstanceVsClassVariables(insClaVarObj1);
        System.out.println("C3 : "+circleCount);

        System.out.println("C2 : "+circleCount);
        System.out.println("C1 : "+circleCount);

    }
}

// The output of the above program is shown as below:
/*
C1 : 1
C2 : 2
C3 : 3
C2 : 3
C1 : 3
 */