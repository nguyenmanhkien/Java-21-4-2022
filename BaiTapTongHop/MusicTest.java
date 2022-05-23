package BaiTapTongHop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MusicTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/musics", "root", "");
                Statement stml = conn.createStatement();

        ){

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
