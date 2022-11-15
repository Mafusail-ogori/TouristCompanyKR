package commandTests;

import command.GenerateTicketsCommand;
import command.SortByPriceCommand;
import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;

public class SortByPriceCommandTest {
    @Mock
    TouristAttractionsData ticketsDataBase = new TouristAttractionsData();
    boolean isSorted(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getPrice() <= ticketsDataBase.getTouristTickets().get(i+1).getPrice())){
                return false;
            }
        }
        return true;
    }

    @Test
    @DisplayName("Sort By Price should work")
    public void TestSortByPrice(){
        new GenerateTicketsCommand(ticketsDataBase).execute();
        new SortByPriceCommand(ticketsDataBase).execute();
        assertTrue(isSorted(ticketsDataBase));
    }
}