package commandTests;

import command.LogOutCommand;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class LogOutCommandTest {
    @Test
    @DisplayName("Log out should return coorect value")
    public void logOutCommandTest(){
        new LogOutCommand().execute();
    }
}
