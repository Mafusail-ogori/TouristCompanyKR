package userMenu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static userMenu.Menu.wholeMenu;

public class MenuCaller {
    public static void main(String[] args) throws IOException {
        String jdbcURL = "jdbc:postgresql://localhost:5432/TouristCompanyDatabase";
        String userName = "postgres";
        String password = "Hajaomija123";
        try{
            Connection connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connected successfully");

            connection.close();
        } catch (SQLException exception){
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();
        }
//        wholeMenu();
    }
}