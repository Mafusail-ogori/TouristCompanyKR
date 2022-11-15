package command;

import data.UserData;

import java.io.IOException;

public class FileReadingCommand implements Command {

    UserData database;

    public FileReadingCommand(UserData database) {
        this.database = database;
    }

    @Override
    public void execute() throws IOException {
        database.fileReading();
    }
}
