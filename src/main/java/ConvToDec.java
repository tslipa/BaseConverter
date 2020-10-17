public class ConvToDec implements Converter
{
    public static int convert(int base, int number)
    {
        if (base == 10)
        {
            return number;
        }

        int convertedNumber = 0;
        int currBase = 1;

        while (number > 0)
        {
            convertedNumber += (number % 10 * currBase);
            number /= 10;
            currBase *= base;
        }

        return convertedNumber;
    }
}
