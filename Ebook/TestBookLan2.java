package jdbc;

import java.sql.*;

public class TestBookLan2 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select name from Book";
            System.out.println("The SQL statement is: " + strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The record selected are:");
            int rowCount = 0;
            while (rset.next()){
                String name = rset.getString("Title");
                System.out.println(name);
                ++rowCount;
            }
            System.out.println("Total number of record is: "+rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
