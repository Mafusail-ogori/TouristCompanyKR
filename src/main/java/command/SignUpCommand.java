package command;

import data.UserData;

public class SignUpCommand implements Command {
    public SignUpCommand(UserData database) {
        this.database = database;
    }

    UserData database;

    @Override
    public void execute() {
        database.signUp();
    }
}
