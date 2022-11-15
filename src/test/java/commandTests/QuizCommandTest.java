package commandTests;

import command.QuizCommand;
import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class QuizCommandTest {
    @Mock
    String userInput = "5" + System.getProperty("line.separator") +
            "yes" + System.getProperty("line.separator") +
            "no" + System.getProperty("line.separator") +
            "yes" + System.getProperty("line.separator") +
            "no" + System.getProperty("line.separator") +
            "train" + System.getProperty("line.separator");

    @Mock
    TouristAttractionsData ticketsDatabase = new TouristAttractionsData();

    @Test
    @DisplayName("Quiz should work")
    public void quizCommandTest(){
        ticketsDatabase.touristTicketGenerator();
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        new QuizCommand(ticketsDatabase).execute();
        assertEquals(4000, ticketsDatabase.getTouristTickets().size());
    }
}