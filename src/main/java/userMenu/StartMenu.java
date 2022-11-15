package userMenu;

import command.*;
import data.UserData;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static graphicsText.Graphics.startMenuText;
import static userMenu.Menu.userChoice;

public class StartMenu {
    public static void startMenu(UserData database) throws IOException {
        System.out.println(startMenuText);
        Map<Integer, Command> menuCommands = new HashMap<>();
        menuCommands.put(1, new LogInCommand(database));
        menuCommands.put(2, new SignUpCommand(database));
        menuCommands.put(3, new DeleteAccountCommand(database));
        menuCommands.put(4, new ExitCommand());
        var choice = 0;
        while(choice != 1){
            choice = userChoice();
            new FileReadingCommand(database).execute();
            menuCommands.get(choice).execute();
        }
    }
}