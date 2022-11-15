package commandTests;

import command.ShowAllPorposalsCommand;
import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class ShowAllPorposalsCommandTest {
    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();

    @Test
    @DisplayName("Display porposals should work!")
    public void showAllPorposalsCommandTest() {
        touristAttractionsData.touristTicketGenerator();
        new ShowAllPorposalsCommand(touristAttractionsData);
        assertEquals(4000, touristAttractionsData.getTouristTickets().size());
    }
}
