import com.careerit.jfs.cj.day1.NumberOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOperationsTest {
    @Test
    void biggestAsFirstNumber() {
        NumberOperations obj = new NumberOperations();
        int actual = obj.biggest(30, 20, 10);

        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void biggestAsSecondNumber() {
        NumberOperations obj = new NumberOperations();
        int actual = obj.biggest(10, 20, 10);

        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void biggestAThirdNumber() {
        NumberOperations obj = new NumberOperations();
        int actual = obj.biggest(10, 20, 30);

        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void allValuesEqual() {
        NumberOperations obj = new NumberOperations();
        int actual = obj.biggest(10, 10, 10);

        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}
