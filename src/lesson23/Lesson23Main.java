package lesson23;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson23Main {
    public static void main(String[] args) throws SQLException {

        DBConnection db = new DBConnection();
        Statement stmt = db.conn.createStatement();

        try {

            String query = "SELECT * from spaceships";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }catch (SQLException e) {
        System.out.println("There was a SQL exception");

        }

    }
}
