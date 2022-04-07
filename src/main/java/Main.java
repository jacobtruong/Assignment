import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a new StudentEnrolment class
        StudentEnrolment studentEnrolment = new StudentEnrolment();

        // Enrolling students
        // Enroll a student
        System.out.println("-----------------------------------------------\n[Enrolling a new student into a new course]");
        studentEnrolment.add();

        // Update an enrolment of a student for 1 semester
        System.out.println("-----------------------------------------------\n[Update a student's enrolment in a semester]");
        studentEnrolment.update();


        // Printing data as requested
        // Print all courses for 1 student in 1 semester.
        System.out.println("-----------------------------------------------\n[Print all courses of a student in a semester]");
        studentEnrolment.getAll(1);

        //  Print all students of 1 course in 1 semester.
        System.out.println("-----------------------------------------------\n[Print all students of a course in a semester]");
        studentEnrolment.getAll(2);

        // Prints all courses offered in 1 semester.
        System.out.println("-----------------------------------------------\n[Print all courses offered in a semester]");
        studentEnrolment.getAll(3);

        // Unit testing code
        StudentEnrolment.checkIfInt("ABCD");
        studentEnrolment.studentInput();
        studentEnrolment.courseInput();
        studentEnrolment.semesterInput();
        studentEnrolment.add();
        studentEnrolment.update();
        studentEnrolment.delete();
        studentEnrolment.getAll(1);
        studentEnrolment.getAll(2);
        studentEnrolment.getAll(3);
        studentEnrolment.getListOfCourses();
        studentEnrolment.getListOfCourses();
        studentEnrolment.getAllEnrolments();
    }
}
