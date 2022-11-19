package userMenu;

import command.GenerateTicketsCommand;
import data.TouristAttractionsData;

import java.io.IOException;

import static data.TouristAttractionsData.touristTicketGenerator;
import static userMenu.Menu.wholeMenu;

public class MenuCaller {
    public static void main(String[] args) throws IOException {
//        touristTicketGenerator();
        wholeMenu();
    }
}