package userMenu;

import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static userMenu.SortMenu.sortMenu;

public class SortMenuTest {
    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();

    @Mock
    String userInput = "2";

    @Mock
    String userInput2 = "1";

    @Mock
    String getUserInput3 = "3";

    boolean isSorted(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getPrice() <= ticketsDataBase.getTouristTickets().get(i+1).getPrice())){
                return false;
            }
        }
        return true;
    }

    boolean isSorted2(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getPeriod() <= ticketsDataBase.getTouristTickets().get(i+1).getPeriod())){
                return false;
            }
        }
        return true;
    }

    boolean isSorted3(TouristAttractionsData ticketsDataBase){
        for(int i = 0; i < ticketsDataBase.getTouristTickets().toArray().length - 1; i++){
            if(!(ticketsDataBase.getTouristTickets().get(i).getHotelRating() <= ticketsDataBase.getTouristTickets().get(i+1).getHotelRating())){
                return false;
            }
        }
        return true;
    }

    @Test
    @DisplayName("Sort menu should work 1")
    public void sortMenuTest1() throws IOException {
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        sortMenu(touristAttractionsData);
        assertTrue(isSorted(touristAttractionsData));
    }
    @Test
    @DisplayName("Sort menu should work 2")
    public void sortMenuTest2() throws IOException {
        System.setIn(new ByteArrayInputStream(userInput2.getBytes()));
        sortMenu(touristAttractionsData);
        assertTrue(isSorted2(touristAttractionsData));
    }
    @Test
    @DisplayName("Sort menu should work 3")
    public void sortMenuTest3() throws IOException {
        System.setIn(new ByteArrayInputStream(getUserInput3.getBytes()));
        sortMenu(touristAttractionsData);
        assertTrue(isSorted3(touristAttractionsData));
    }
}
