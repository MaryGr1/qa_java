import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CatTest {

    Cat cat = new Cat(new Feline());

    @Test

    public void getSoundReturnsCorrectSoundTest()
    {
        String catText = "Мяу";
        assertEquals("Звук не соответствует", catText, cat.getSound());
    }


    @Test

    public void getSoundReturnsNonNullTest()
    {
        assertNotNull(cat.getSound());
    }


    }



