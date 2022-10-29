package userMenu;

import command.*;
import data.UserData;

import java.util.HashMap;

import static graphicsText.Graphics.startMenuText;
import static userMenu.Menu.userChoice;

public class StartMenu {
    public static void startMenu(UserData database) {
        System.out.println(startMenuText);
        HashMap<Integer, Command> menuCommands = new HashMap<>();
        menuCommands.put(1, new LogInCommand(database));
        menuCommands.put(2, new SignUpCommand(database));
        menuCommands.put(3, new DeleteAccountCommand(database));
        menuCommands.put(4, new ExitCommand());
        var choice = 0;
        while(choice != 1){
            choice = userChoice();
            menuCommands.get(choice).execute();
        }
    }
}

