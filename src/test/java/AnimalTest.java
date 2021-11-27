import com.example.Animal;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnimalTest {
    Animal animal = new Animal();
    @Test
    public void PredatorGetFoodTest() throws Exception {
        List<String> actual = animal.getFood("Хищник");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void herbivoresGetFoodTest() throws Exception {
        List<String> actual = animal.getFood("Травоядное");
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, actual);
    }

    @Test
    public void unidentifiedAnimalGetFoodTest() throws Exception {
        try {
            animal.getFood("Неведома зверушка");
            fail("Exception");
        } catch (Exception ex) {
            assertThat(ex.getMessage(), containsString("Неизвестный вид животного, используйте значение Травоядное или Хищник"));
        }
    }

    @Test
    public void getFamilyTest(){
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}