import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ParametrizedTest {
    private final int count;
    private final int expected;

    public ParametrizedTest(int count, int expected) {
        this.count = count;
        this.expected = expected;
    }

    @Parameterized.Parameters

    public static Object [][] getKittensReturnsTest()
    {
        return new Object[][]
                {
                        {1, 1},
                        {5, 5},
                        {10, 10}
                };
    }
@Test

public void getKittensWithCountReturnsCorrectCountTest() {
        Feline feline = new Feline();

    assertEquals("Значения не равны", expected, feline.getKittens(count));
}

}



