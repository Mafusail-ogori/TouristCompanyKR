package touristAttractionDataFunctionTests;

import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;
import touristAttraction.TransportationType;

import static org.junit.Assert.assertTrue;
import static touristAttraction.TransportationType.Car;
import static touristAttraction.TransportationType.Plane;

public class IsSameTransportTest {
    @Mock
    TransportationType transportType = Car;

    @Mock
    TransportationType transportationType = Plane;

    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();

    @Test
    @DisplayName("Same Transport function should work")
    public void isSameTransportTest(){
        assertTrue(touristAttractionsData.isSameTransport("Car", transportType) &&
                touristAttractionsData.isSameTransport("PLANE", transportationType));
    }
}