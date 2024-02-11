public class StudentConstructor {
    private String nameStudent;
    private int ageStudent;

    public StudentConstructor(){
        this.nameStudent = "Rama";
        this.ageStudent = 27;
    }

    public StudentConstructor(String nameStudent, int ageStudent){
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
    }

    public String getNameStudente(){
        return nameStudent;
    }

    public int getageStudent(){
        return ageStudent;
    }

    public void setNameStudent(String newStudent) {
        this.nameStudent = newStudent;
    }
    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public void displayNameandStudent(){
        System.out.println("Name Of Student : "+getNameStudente());
        System.out.println("Age of the Student: "+getageStudent());
    }


    public static void main(String[] args) {

        StudentConstructor stdConObj;
        stdConObj = new StudentConstructor();

        System.out.println("Initial Values");

        System.out.println("Inital name  "+ stdConObj.getNameStudente());
        System.out.println("Initial age  "+ stdConObj.getageStudent());

        StudentConstructor stdConObj1;
        stdConObj1 = new StudentConstructor("Poornima", 47);

        stdConObj1.displayNameandStudent();

        stdConObj1.setNameStudent("Atharva");
        stdConObj1.setAgeStudent(26);

        stdConObj1.displayNameandStudent();




    }



}
