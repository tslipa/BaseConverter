/**
 * Class that checks given data.
 */
public final class DataCheck
{
    /**
     * Private constructor of the class.
     */
    private DataCheck() {}

    /**
     * Method that initialises the check.
     *
     * @param baseA base from which we convert
     * @param baseB base to which we convert
     * @param number number that we convert
     * @throws ConversionException exception thrown if the parameters are wrong
     */
    public static void initCheck(int baseA, int baseB, int number) throws ConversionException
    {
        checkBases(baseA, baseB);
        checkNumber(number, baseA);
    }

    /**
     * Method that checks if the bases are correct.
     *
     * @param baseA base from which we convert
     * @param baseB base to which we convert
     * @throws ConversionException exception thrown if the bases are out of range (2-10) or the same
     */
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

    /**
     * Method that checks if the number is correct.
     *
     * @param number number that we want to convert
     * @param base the base in which the number is written
     * @throws ConversionException exception thrown if the number is negative or when it's incorrect
     */
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
