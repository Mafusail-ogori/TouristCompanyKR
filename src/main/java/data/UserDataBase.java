package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDataBase {
    Connection connection;

    public UserDataBase() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TouristCompanyDatabase",
                    "postgres",
                    "Hajaomija123");
        } catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();

        }
    }

    public void signUpUser(String nickName, String userName, String password, String emailAddress) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("insert into userinfo (nickname, realname, password, emailaddress) values ('%s', '%s', '%s', '%s')", nickName, userName, password, emailAddress));
            connection.close();
        } catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();

        }
    }
}

