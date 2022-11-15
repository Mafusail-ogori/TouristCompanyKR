package command;

import data.UserData;

import java.io.IOException;

public class SignUpCommand implements Command {
    public SignUpCommand(UserData database) {
        this.database = database;
    }

    UserData database;

    @Override
    public void execute() throws IOException {
        database.signUp();
    }
}
