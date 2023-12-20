public class PersonCon {
    private String nameStudent;
    private int ageStudent;

    // Constructor

    public PersonCon(){
        this.nameStudent = "VB";
        this.ageStudent = 52;
    }

    // parameterized class

    public PersonCon(String nameStudent, int ageStudent){
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
    }

    public String getNameStudent(){
        return nameStudent;
    }

    public int getAgeStudent(){
        return ageStudent;
    }

    public void setNameStudent(String nameStudent){
        this.nameStudent = nameStudent;
    }

    public void setAgeStudent(int ageStudent){
        this.ageStudent = ageStudent;
    }

    public void displayNameandAge(){
        System.out.println("Name :"+this.nameStudent);
        System.out.println("Age  :"+this.ageStudent);
    }

    public static void main(String[] args) {

        PersonCon p1Obj;
        p1Obj = new PersonCon();

        System.out.println("Initial Details");
        System.out.println("Name"+p1Obj.getNameStudent());
        System.out.println("Age"+p1Obj.getAgeStudent());



    }

}
