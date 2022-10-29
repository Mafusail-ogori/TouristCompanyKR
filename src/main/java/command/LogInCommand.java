package command;

import data.UserData;

public class LogInCommand implements Command {

    UserData database;

    public LogInCommand(UserData database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.logIn();
    }
}
