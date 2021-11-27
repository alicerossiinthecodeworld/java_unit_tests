import com.example.LionAlex;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LionAlexTest {
    LionAlex alex = new LionAlex();
    @Test
    public void getFriendsTest(){
        String actual = alex.getFriends();
        String expected = "Зебра Марти, бегемотиха Глория, жираф Мелман";
        assertEquals(expected,actual);
    }
    @Test
    public void getPlaceOfLivingTest(){
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected,actual);
    }
    @Test
    public void getKittensTest(){
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected,actual);
    }
}
