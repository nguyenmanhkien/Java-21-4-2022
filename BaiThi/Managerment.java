package BaiThi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Managerment {
    private List<Student> studentList;
    private static Scanner input = new Scanner(System.in);

    public Managerment() {
        this.studentList = new ArrayList<>();
    }

    public void objAddStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent() {
        int studentID;
        String name, address, phone;

        System.out.println("You choosed adding student record!");
        System.out.println("Please enter student ID: ");
        studentID = input.nextInt();

        if (studentList.stream().allMatch(student -> student.getStudentID() != (studentID))) {
            System.out.println("Enter student name");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter address");
            address = input.nextLine();
            System.out.println("Enter phone number");
            phone = input.nextLine();
            Student stu = new Student(studentID, name, address, phone);
            studentList.add(stu);
            System.out.println("Successfully added 1 student!");
        } else {
            System.out.println("Duplicate student ID, add failed!");
        }
    }
    public void displayCollectionStudent() {
        System.out.println("You choosed display student records in collection.");
        System.out.printf("%-30s%-30s%-30s%-30s","ID","Name","Address","Phone");
        System.out.println();
        for (Student student: studentList) {
            System.out.printf("%-30s%-30s%-30s%-30s",student.getStudentID(),student.getName(),student.getAddress(),student.getPhone());
            System.out.println();
        }
    }
}