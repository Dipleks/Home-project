package db;

public interface TableDB
{
    String db = "text_proposal"; // имя БД
    String DB_URL = "jdbc:postgresql://127.0.0.1:5433/"; //URL БД, по умолчанию необходимо изменить на порт 5432!!!
    String USER = "postgres"; // логин к БД
    String PASS = "353808"; // пароль к БД
    String NEW_DB = "CREATE DATABASE text_proposal"; // создаем новую БД
///////////
    // Создаём таблицу Present Simple Approves:
    String appPS = "";

    // Создаем таблицу Present Simple Negatives:
    String negPS = "";

    // Создаем таблицу Present Simple Questions:
    String quesPS = "";

    // Создаем таблицу Present Simple Exams:
    String examPS = "";
///////////
    // Создаём таблицу Form to be Approves:
    String appToBe = "";

    // Создаем таблицу Form to be Negatives:
    String negToBe = "";

    // Создаем таблицу Form to be Questions:
    String quesToBe = "";

    // Создаем таблицу Form to be Exams:
    String examToBe = "";
}
