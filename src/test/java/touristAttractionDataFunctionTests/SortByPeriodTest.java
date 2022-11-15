package touristAttractionDataFunctionTests;

import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;

public class SortByPeriodTest {
    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();

    boolean isSorted(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getPeriod() <= ticketsDataBase.getTouristTickets().get(i+1).getPeriod())){
                return false;
            }
        }
        return true;
    }

    @Test
    @DisplayName("Sort by period should work")
    public void sortByPeriodTest(){
        touristAttractionsData.touristTicketGenerator();
        touristAttractionsData.sortByPeriod();
        assertTrue(isSorted(touristAttractionsData));
    }
}
