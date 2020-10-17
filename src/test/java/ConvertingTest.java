import static org.junit.Assert.*;
import org.junit.Test;

public class ConvertingTest
{
    @Test
    public void testIDK()
    {
        int baseA = 8;
        int baseB = 2;
        int number = 346;
        assertEquals(11100110, ConvFromDec.convert(baseB, ConvToDec.convert(baseA, number)));
    }
}
