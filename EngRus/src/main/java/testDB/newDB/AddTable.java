package testDB.newDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTable implements StrTest
{
    static String db = "testnewdb"; //имя БД
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/"; //URL БД
    static final String USER = "postgres"; //Вводим логин к БД
    static final String PASS = "353808"; //Вводим пароль к БД

    public static void main(String[] args) throws SQLException{

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер PostgreSQL JDBC не найден. Включите его в путь к библиотеке!");
            e.printStackTrace();
            return;
        }

        Connection connection = null;
        try {
            connection = DriverManager
                    .getConnection(DB_URL + db, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Не удачное подключение драйвера!");
            e.printStackTrace();
            return;
        }

        Statement statement = connection.createStatement();
        statement.executeUpdate(teblTest);
        statement.executeUpdate(teblTest2);
        statement.executeUpdate(teblTest3);
    }
}
