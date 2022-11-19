package data;

import touristAttraction.TouristTicket;

import java.sql.*;
import java.util.List;
import java.util.Locale;

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

    public void addToDataBase(String title, int period, int peopleAmount, String hasChild, String hasAnimal,
                              String needNoiseReduction, String includesParty, String ticketType, double price,
                              int hotelRating, String transportationType){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format(Locale.US,"insert into touristattraction(title, period, " +
                    "peopleamount, haschild, " +
                    "hasanimal, neednoisereduction, includesparty, tickettype, price, hotelrating, " +
                    "transportationtype)" +
                    "values ('%s', '%d', '%d', '%s', '%s', '%s', '%s', '%s', '%f', '%d', '%s')", title, period,
                    peopleAmount, hasChild, hasAnimal, needNoiseReduction, includesParty, ticketType,
                    price, hotelRating, transportationType));
            connection.close();
        } catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();
        }
    }

    public void readFromDataBase(List<TouristTicket> touristTicketList){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.exe

        }catch (SQLException exception) {
            System.out.println("Connection to database failed, contact help");
            exception.printStackTrace();
        }
    }
}
