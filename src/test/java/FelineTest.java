import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void getFamilyTest(){
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected,actual);
    }
    @Test
    public void getKittensTest() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatTest()throws Exception{
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }
}

