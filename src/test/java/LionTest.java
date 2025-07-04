import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самка",feline);
    }

    @Mock
    private Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected,lion.getFood());
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }


    @Test
    public void getKittensTest () throws Exception {
        int expected = 0;
        Assert.assertEquals(expected,lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void lionConstructorThrowsExceptionForInvalidSexTest() throws Exception {
        new Lion("Неизвестный пол", feline);
    }
}
