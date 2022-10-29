package command;

import data.UserData;

public class DeleteAccountCommand implements Command {

    UserData database;

    public DeleteAccountCommand(UserData database) {
        this.database = database;
    }


    @Override
    public void execute() {
        database.deleteAccount();
    }
}
