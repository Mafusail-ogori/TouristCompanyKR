package touristAttractionDataFunctionTests;

import data.TouristAttractionsData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class QuestionerTest {
    @Mock
    TouristAttractionsData touristAttractionsData = new TouristAttractionsData();
    @Mock
    String userInputEmulation = "5" + System.getProperty("line.separator") +
            "yes" + System.getProperty("line.separator") +
            "no" + System.getProperty("line.separator") +
            "yes" + System.getProperty("line.separator") +
            "no" + System.getProperty("line.separator") +
            "train" + System.getProperty("line.separator");

    @Test
    @DisplayName("Questioner should work")
    public void questionerTest(){
        System.setIn(new ByteArrayInputStream(userInputEmulation.getBytes()));
        var answers = touristAttractionsData.questioner().toString();
        assertEquals("5 yes no yes no train", answers);
    }
}