public class ConvFromDec implements Converter
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
            convertedNumber += (number % base * currBase);
            number /= base;
            currBase *= 10;
        }

        return convertedNumber;
    }
}
