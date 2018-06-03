package db;

import java.sql.*;

public class CreateDB implements TableDB
{
    private static Connection connection;

    public static void newDB() throws SQLException, ClassNotFoundException {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(NEW_DB);
    }

    public static boolean connectDB() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from pg_database WHERE datname = 'text_proposal'");
        while (resultSet.next()) {
            if (resultSet.getString("datname").equals("text_proposal")){
                resultSet.close();
                connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
                return true;
            }
        }
        return false;
    }
}
