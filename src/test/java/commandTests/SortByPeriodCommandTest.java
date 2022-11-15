package commandTests;

import command.GenerateTicketsCommand;
import command.SortByPeriodCommand;
import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;

public class SortByPeriodCommandTest {
    @Mock
    TouristAttractionsData ticketsDataBase = new TouristAttractionsData();

    boolean isSorted(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getPeriod() <= ticketsDataBase.getTouristTickets().get(i+1).getPeriod())){
                return false;
            }
        }
        return true;
    }
    @Test
    @DisplayName("Sort By Period should work!")
    public void TestSortByPeriod(){
        new GenerateTicketsCommand(ticketsDataBase).execute();
        new SortByPeriodCommand(ticketsDataBase).execute();
        assertTrue(isSorted(ticketsDataBase));
    }
}
