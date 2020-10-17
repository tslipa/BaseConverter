import static org.junit.Assert.*;
import org.junit.Test;

public class ConvertingTest
{
    @Test
    public void testCorrectData()
    {
        int baseA = 2;
        int baseB = 3;
        int number = 101011;

        assertEquals(1121, Converter.initConversion(baseA, baseB, number));
    }
}
