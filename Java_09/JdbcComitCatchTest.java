package Java_09;

import java.sql.*;

public class JdbcComitCatchTest {
    public static void main(String[] args) throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8888/ebookshop","myuser","xxx";
                    Statement stmt = conn.createStatement();
            ) {
                try {
                    conn.setAutoCommit(false);
                    stmt.executeUpdate("insert into books values(4001,'Paul Chan','Mahjong 101',4.4,4)");
                    stmt.executeUpdate("insert into books values (4001,'Peter Chan','Mahjong 102', 4.4,4)");
                    conn.commit();
                }catch (SQLException e) {
                    System.out.println("-- Rolling back changes --");
                    conn.rollback();
                    e.printStackTrace();
                }
            }
        }
    }
}
