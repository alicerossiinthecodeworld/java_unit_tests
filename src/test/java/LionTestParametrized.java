import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionTestParametrized {
    private final int kittens;
    public LionTestParametrized(int kittens) {
        this.kittens = kittens;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] getKittens(){
        return new Object[][] {
                {1},
                {9},
                {10},
                {5},
                {-15000},
                {2000}
        };
    }

    // !!!метод отрабатывает, когда передаётся  отрицательное число, так быть не должно
    @Test
    public void getKittensTest(){
        Lion lion = new Lion(feline);
        when(lion.getKittens(kittens)).thenReturn(kittens);
        int actual = lion.getKittens(kittens);
        int expected = kittens;
        assertEquals(expected,actual);
    }
}
