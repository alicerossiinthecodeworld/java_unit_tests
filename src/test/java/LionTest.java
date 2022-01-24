import com.example.Feline;
import com.example.Lion;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;


    @Test
    public void maleLionHasManeTest() throws Exception {
    Lion lion = new Lion("Самец", feline);
    boolean actual = lion.doesHaveMane();
    boolean expected = true;
    assertEquals(expected,actual);
    }
    @Test
    public void lionessHasNoManeTest() throws Exception {
        Lion lioness = new Lion("Самка", feline);
        boolean actual = lioness.doesHaveMane();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    public void unexpectedLionSexExceptionTest() throws Exception {
        try{
            Lion leo = new Lion("Самк", feline);
            fail("Exception");}
            catch(Exception ex){
                assertThat(ex.getMessage(), containsString("Используйте допустимые значения пола животного - самец или самка"));
    }
}
    @Test
    public void getKittensTest(){
        Lion alex = new Lion(feline);
        when(feline.getKittens()).thenReturn(1);
        int actual = alex.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion alex = new Lion(feline);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = alex.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }

}

