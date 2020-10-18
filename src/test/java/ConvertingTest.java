import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ConvertingTest
{
    @Test
    public void testCorrectData()
    {
        int baseA = 2;
        int baseB = 3;
        int number = 101011;

        try
        {
            assertEquals(1121, Converter.initConversion(baseA, baseB, number));
        }
        catch (ConversionException e) { }
    }

    @Test
    public void testConversionException()
    {
        int baseA = 2;
        int baseB = -3;
        int number = 101011;

        try
        {
            Converter.initConversion(baseA, baseB, number);
            Assert.fail("Expected exception to be thrown");
        }
        catch (ConversionException e) { }


    }
}
