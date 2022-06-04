import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertionTest {
    @Test
    public void ConvertionToWeeksTest(){
        int days = 60;
        Weeks cw = new ConvertWeeks();
        Assertions.assertEquals(cw.convertWeeks(days), 7);
    }
}
