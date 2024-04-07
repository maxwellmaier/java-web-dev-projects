package exercises.classespart1.src.main.java;

import java.util.ArrayList;

public class CourseManager {
    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher();
        teacher.setFirstName("John");
        teacher.setLastName("Doe");
        teacher.setSubject("Computer Science");
        teacher.setYearsTeaching(5);

        // Create a Course object
        Course course = new Course("Java Programming", teacher);

        // Create Student objects
        Student student1 = new Student("Alice", 101, 3, 3.5);
        Student student2 = new Student("Bob", 102, 2, 3.0);
        Student student3 = new Student("Charlie", 103, 1, 4.0);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);

        // Print class list
        System.out.println("Course Topic: " + course.getTopic());
        System.out.println("Instructor: " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
        System.out.println("Students Enrolled:");
        ArrayList<Student> students = course.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Student ID: " + student.getStudentId());
        }
    }
}
