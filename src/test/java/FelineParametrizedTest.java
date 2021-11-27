import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {
     private final int kittens;

    public FelineParametrizedTest(int kittens) {
        this.kittens = kittens;
    }
    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][]{
                {1},
                {9},
                {10},
                {5},
                {-15000},
                {2000}
        };
    }
        @Test
        // !!!метод отрабатывает, когда передаётся  отрицательное число, так быть не должно
        public void getKittensNumberTest(){
            Feline feline = new Feline();
            int actual = feline.getKittens(kittens);
            int expected = kittens;
            assertEquals(expected,actual);
        }
}


