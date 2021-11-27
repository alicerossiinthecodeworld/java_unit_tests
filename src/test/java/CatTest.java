import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import java.util.List;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);

    }

    @Test
    public void getSoundTest(){
        Cat bob = new Cat(feline);
        String actual = bob.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

}