package commandTests;

import command.GenerateTicketsCommand;
import command.SortByRatingCommand;
import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;

public class SortByRatingCommandTest {
    @Mock
    TouristAttractionsData ticketsDataBase = new TouristAttractionsData();

    boolean isSorted(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getHotelRating() <= ticketsDataBase.getTouristTickets().get(i+1).getHotelRating())){
                return false;
            }
        }
        return true;
    }

    @Test
    @DisplayName("Sort By Rating should work!")
    public void TestSortByRating(){
        new GenerateTicketsCommand(ticketsDataBase).execute();
        new SortByRatingCommand(ticketsDataBase).execute();
        assertTrue(isSorted(ticketsDataBase));
    }
}
