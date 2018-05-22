package db;

import ghostInter.interfaceRoot.Root;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDB implements TableDB, Root
{

    public static void newDB() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        Connection connection;
        boolean haveBase;

        try {
            connection = DriverManager
                    .getConnection(DB_URL + db, USER, PASS);
            haveBase = true;
        } catch (Exception e) {
//            showWindow(WINDOW);
            haveBase = false;
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            if (!haveBase) {
                Statement statement = connection.createStatement();
                statement.executeUpdate(NEW_DB);

            }
        }
    }


}
