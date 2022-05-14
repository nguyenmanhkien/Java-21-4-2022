package Music;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Musicc {
    private static Statement stml;

    public static void main(String[] args) {
        try(
                Connection bt = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root", "");
                Statement stmt = bt.createStatement();
        ) {
//            String sqlDelete = "delete  from Music where id > 4";
//            System.out.println("The SQL stametn" + sqlDelete + "\n");
//            int countDelete = stml.executeUpdate(sqlDelete);
//            System.out.println(countDelete + "Bai hat da xoa" + "\n");

            String sqlInsert = "insert  into  Music value" + "(6,'Em cua ngay hom qua','Som Tung',2016)," + "(7,'Am tham ben em', 'Son Tung',2017)";
            System.out.println("The SQL stament " + sqlInsert + "\n");
            int countInsert = stml.executeUpdate(sqlInsert);
            System.out.println(countInsert + " bai hat duoc them");



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
