package touristAttractionDataFunctionTests;

import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;

public class IsSameTest {
    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();

    @Test
    @DisplayName("IsSame should find same")
    public void isSameTest(){
        assertTrue(touristAttractionsData.isSame("yes", true)
                && touristAttractionsData.isSame("no", false));
    }
}
