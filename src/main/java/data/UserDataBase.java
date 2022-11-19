package data;

import user.User;

import java.sql.*;
import java.util.List;

public class UserDataBase {
    Connection connection;

    public UserDataBase() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TouristCompanyDatabase",
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

    public void getDatabaseUsers(List<User> userData){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(String.format("select nickname, realname, password, emailaddress from userinfo"));
            while(resultSet.next()){
                userData.add(new User(resultSet.getString("nickname"),resultSet.getString("realname") ,
                        resultSet.getString("password"), resultSet.getString("emailaddress")));
            }

        } catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();
        }
    }
}