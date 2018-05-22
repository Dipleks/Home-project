package testDB.testDB;

import java.sql.*;

public class JDBCPostgreSQLExample {

    //Учетные данные базы данных:
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/TestEngRus"; //URL БД и название БД
    static final String USER = "postgres"; //Вводим логин к БД
    static final String PASS = "353808"; //Вводим пароль к БД

    public static void main(String[] argv) throws SQLException {

        System.out.println("Начало работы PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер PostgreSQL JDBC не найден. Включите его в путь к библиотеке!");
            e.printStackTrace();
            return;
        }

        System.out.println("Подключение драйвера PostgreSQL JDBC");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Не удачное подключение драйвера!");
            e.printStackTrace();
            return;
        }
        ///////
        try {
            Statement stmt = connection.createStatement();
//            int rs2 = stmt.executeUpdate("UPDATE test2 SET add_i = add_i + 1"); //sql запрос
            int i = 15;
            ResultSet rs = stmt.executeQuery("SELECT * FROM test2 WHERE add_i > " + i); //sql запрос


            while (rs.next()) {
//                String str = rs.getString("text_ru") + ":" + rs.getString(4); //через + указываем несколько значений
                String str = rs.getString("add_i");
                System.out.println("Получим данные из таблицы: " + str);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        ///////////
        if (connection != null) {
            System.out.println("Успешное подключение к БД");
            System.out.println("Отсоединение от БД");
        } else {
            System.out.println("Не удалось установить соединение с БД");
        }
    }
}