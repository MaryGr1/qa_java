import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)

public class CatWithMockTest {

        @Mock
        Feline feline;

        @Test
        public void getFoodReturnsFoodListTest() throws Exception {

            List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
            when(feline.eatMeat()).thenReturn(expectedFood);

            Cat cat = new Cat(feline);

            List<String> actualFood = cat.getFood();

            assertEquals(expectedFood, actualFood);
        }

}
