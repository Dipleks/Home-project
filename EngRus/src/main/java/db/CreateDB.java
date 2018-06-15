package db;

import java.sql.*;

public class CreateDB implements TableDB
{
    private static Connection connection;

    // Создаем новую БД:
    public static void newDB() throws SQLException, ClassNotFoundException {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate(NEW_DB);
    }
    // Создание таблицы счетчика при первом запуске:
    public static void newCounterFirstRun() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
        Statement statement = connection.createStatement();
        statement.executeUpdate(counterExam);
    }
    // Проверяем создана БД или нет:
    public static boolean connectDB() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Statement statement;
        try {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
//            e.printStackTrace();
                System.out.println("CreateDB.connectDB1");
            }

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from pg_database WHERE datname = 'text_proposal'");
            while (resultSet.next()) {
                if (resultSet.getString("datname").equals("text_proposal")){
                    resultSet.close();
                    connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    // Проверка таблицы счетчика при последующих запусках:
    public static boolean newCounterRun() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT table_name FROM information_schema.tables " +
                "WHERE table_name = 'counter';");
        while (resultSet.next()) {
            if (resultSet.getString("table_name").equals("counter")){
                resultSet.close();
                return true;
            }
        }
        return false;
    }
}
