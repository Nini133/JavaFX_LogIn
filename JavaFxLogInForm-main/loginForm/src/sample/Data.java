package sample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Data {

    public static void createTable(){
        String CREATE = "CREATE TABLE IF NOT EXISTS USERS(" +
                "ID INTEGER PRIMARY KEY AUTO_INCREMENT," +
                "NICK VARCHAR(100)," +
                "PASSWORD VARCHAR(50))";

        try {
                JDBCConfig.getStatement().executeUpdate(CREATE);
        } catch (SQLException e){
                throw new RuntimeException(e);
        }
        }
    public static String createUser(String user,String password) throws SQLException {
        String INSERT = "INSERT INTO USERS(NICK, PASSWORD) " +
                "VALUES('" + user + "', '" + password + "')";

        String CHECK = "SELECT NICK FROM USERS";

        try {


            JDBCConfig.getStatement().executeUpdate(INSERT);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        return "User created!";
    }
    }

