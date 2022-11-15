package command;

import data.UserData;

import java.io.IOException;

public class LogInCommand implements Command {

    UserData database;

    public LogInCommand(UserData database) {
        this.database = database;
    }

    @Override
    public void execute() throws IOException {
        database.logIn();
    }
}
