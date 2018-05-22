package testDB.newDB;

public interface StrTest
{
    String teblTest = "CREATE TABLE test_db_java\n" +
            "(\n" +
            "    id SERIAL PRIMARY KEY,\n" +
            "    name VARCHAR(15),\n" +
            "    family VARCHAR(25)\n" +
            ");";
    String teblTest2 = "CREATE TABLE test_db_java2\n" +
            "(\n" +
            "    id SERIAL PRIMARY KEY,\n" +
            "    name VARCHAR(15),\n" +
            "    family VARCHAR(25)\n" +
            ");";
    String teblTest3 = "INSERT INTO test_db_java (name, family)\n" +
            "VALUES ('Denis', 'Zagorodnev'),\n" +
            "('Mishal', 'Zagorodnev');";
}
