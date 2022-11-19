package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TouristAttractionDataBase {
    Connection connection;

    public TouristAttractionDataBase() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TouristCompanyDatabase",
                    "postgres",
                    "Hajaomija123");
        } catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();

        }
    }

    public void addToDataBase(){
        try {
            Statement statement = connection.createStatement();

        } catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();
        }

    }
}
