package userMenu;

import command.*;
import data.TouristAttractionsData;

import java.util.HashMap;

import static graphicsText.Graphics.finalMenuText;
import static userMenu.Menu.userChoice;
import static userMenu.SortMenu.sortMenu;

public class AfterMenu {
    public static boolean afterMenu(TouristAttractionsData ticketsDataBase){
        HashMap<Integer, Command> afterMenuCommand = new HashMap<>();
        afterMenuCommand.put(1, new QuizCommand(ticketsDataBase));
        afterMenuCommand.put(2, new ShowAllPorposalsCommand(ticketsDataBase));
        afterMenuCommand.put(3, new LogOutCommand());
        var choice = 0;
        while(choice != 3){
            new GenerateTicketsCommand(ticketsDataBase).execute();
            sortMenu(ticketsDataBase);
            System.out.println(finalMenuText);
            choice = userChoice();
            afterMenuCommand.get(choice).execute();
        }
        return false;
    }
}
