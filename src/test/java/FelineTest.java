import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



    @RunWith(MockitoJUnitRunner.class)
    public class FelineTest {

        private Feline feline;

        @Before
        public void setUp() {
            feline = new Feline();
        }

        @Test

        public void getFamilyReturnsCorrectFamilyTest()
        {
            String catText = "Кошачьи";
            assertEquals(catText, feline.getFamily());
        }

        @Test

        public void getFamilyReturnsNonNullTest()
        {
            assertNotNull(feline.getFamily());
        }

        @Test
        public void eatMeatReturnsPredatorFood() throws Exception {
            List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expectedFood, feline.eatMeat());
        }

    }
