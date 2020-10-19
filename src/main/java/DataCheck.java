public final class DataCheck
{
    private DataCheck() {}

    public static void initCheck(int baseA, int baseB, int number) throws ConversionException
    {
        checkBases(baseA, baseB);
        checkNumber(number, baseA);
    }

    private static void checkBases(int baseA, int baseB) throws ConversionException
    {
        int minBase = 2;
        int maxBase = 10;

        if (baseA < minBase || baseB < minBase || baseA > maxBase || baseB > maxBase)
        {
            throw new ConversionException("One of the bases is not between 2 and 10.");
        }
        else if (baseA == baseB)
        {
            throw new ConversionException("The bases are the same.");
        }
    }

    private static void checkNumber(int number, int base) throws ConversionException
    {
        int minNumber = 0;

        if (number < minNumber)
        {
            throw new ConversionException("The number should be a positive integer.");
        }

        while (number > 0)
        {
            if (number % 10 >= base)
            {
                throw new ConversionException("The number is invalid.");
            }
            number /= 10;
        }
    }
}
