public class StudentsRegister {
    public static void main(String[] args) {
        int totalStudents = 5; // Adjusted for the first 5 students
        int[][] attendanceMatrix = new int[totalStudents][10]; // Matrix to store attendance for 10 days

        // Marking the first and third students as absent from the 3rd day onwards
        boolean[] absentStudents = new boolean[totalStudents + 1];
        absentStudents[1] = true;
        absentStudents[3] = true;

        // Simulating attendance marking for the first 10 days
        for (int day = 1; day <= 10; day++) {
            System.out.println("Day " + day + " Attendance:");

            // Simulating marking attendance for each student
            for (int student = 0; student < totalStudents; student++) {
                if (!absentStudents[student + 1]) {
                    attendanceMatrix[student][day - 1] = student + 1; // Marking present
                    System.out.print("Student " + (student + 1) + ": Present\t");
                } else {
                    attendanceMatrix[student][day - 1] = 0; // Marking absent
                    System.out.print("Student " + (student + 1) + ": Absent\t");
                }
            }
            System.out.println(); // Move to the next line for the next day's attendance
        }

        // Displaying the attendance matrix
        System.out.println("\nAttendance Matrix:");
        for (int i = 0; i < totalStudents; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(attendanceMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
