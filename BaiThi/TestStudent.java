package BaiThi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
        ) {
            List<Student> studentList = new ArrayList<>();
            Managerment managerment = new Managerment();
            System.out.println("Enter 1 to start program!");
            System.out.println("Enter 4 to end.");
            Scanner exit = new Scanner(System.in);
            int exitBtn = exit.nextInt();
            while (exitBtn != 4){
                Scanner in = new Scanner(System.in);
                System.out.println("* Enter 1 to add student record.");
                System.out.println("* Enter 2 to display student records in collection.");
                System.out.println("* Enter 3 to save student record to database.");
                System.out.println("* Enter 4 to exit.");
                System.out.println("* Enter 5 to display student records in database.");
                System.out.println("Enter your choice: ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        managerment.addStudent();
                        break;
                    case 2:
                        managerment.displayCollectionStudent();
                        break;
                    case 3:
                        System.out.println("You choosed saving the student records!");
                        List<Student> listStudent = managerment.getStudentList();
                        String saveStm = "INSERT INTO student(studentID, name, address, phone) VALUES (?, ?, ?,?);";
                        PreparedStatement pstmt = conn.prepareStatement(saveStm);
                        int count = 0;
                        for (Student student: listStudent) {
                            pstmt.setInt(1, student.getStudentID());
                            pstmt.setString(2, student.getName());
                            pstmt.setString(3, student.getAddress());
                            pstmt.setString(4, student.getPhone());
                            pstmt.executeUpdate();
                            ++count;
                        }
                        System.out.println(count + "records saved!");
                        break;
                    case 4:
                        exitBtn = 4;
                        break;
                    case 5:
                        System.out.println("You choosed displaying student records saved in database!");

                        String displayStm = "Select * from student";
                        PreparedStatement prpStmSelect = conn.prepareStatement(displayStm);
                        ResultSet rset = prpStmSelect.executeQuery();
                        ResultSetMetaData rsetMD = rset.getMetaData();
                        int numColumns = rsetMD.getColumnCount();
                        for (int i = 1; i <= numColumns; ++i) {
                            System.out.printf("%-30s", rsetMD.getColumnName(i));
                        }
                        System.out.println();
                        for (int i = 1; i <= numColumns; ++i) {
                            System.out.printf("%-30s",
                                    "(" + rsetMD.getColumnClassName(i) + ")");
                        }
                        System.out.println();
                        while (rset.next()) {
                            for (int i = 1; i <= numColumns; ++i) {
                                System.out.printf("%-30s", rset.getString(i));
                            }
                            System.out.println();
                        }
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
