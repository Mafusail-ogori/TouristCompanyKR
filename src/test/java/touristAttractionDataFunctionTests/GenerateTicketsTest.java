package touristAttractionDataFunctionTests;

import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class GenerateTicketsTest {
    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();

    @Test
    @DisplayName("Tickets generator should work properly")
    public void generateTicketsTest(){
        touristAttractionsData.touristTicketGenerator();
        assertEquals(4000, touristAttractionsData.getTouristTickets().size());
    }
}
