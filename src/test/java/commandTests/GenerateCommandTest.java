package commandTests;

import command.GenerateTicketsCommand;
import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class GenerateCommandTest {
    @Mock
    TouristAttractionsData ticketsDataBase = new TouristAttractionsData();
    @Test
    @DisplayName("Ticket generator should work")
    public void testGenerateCommand(){
        new GenerateTicketsCommand(ticketsDataBase).execute();
        assertEquals(4000, ticketsDataBase.getTouristTickets().toArray().length);
    }
}