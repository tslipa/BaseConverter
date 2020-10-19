/**
 * Class that converts the number.
 */
public final class Converter
{
    /**
     * Private constructor of the class.
     */
    private Converter() {}

    /**
     * Method that checks the data and initialises the conversion to base 10 and then from base 10.
     *
     * @param baseA base from which we convert
     * @param baseB base to which we convert
     * @param number number that we convert
     * @return converted number
     * @throws ConversionException exception thrown by called initCheck method
     */
    public static int initConversion(int baseA, int baseB, int number) throws ConversionException
    {
        DataCheck.initCheck(baseA, baseB, number);
        int base10 = 10;

        int decimalFormat = number;
        if (baseA != base10)
        {
            decimalFormat = convert(baseA, 10, number);
        }

        int finalFormat = decimalFormat;
        if (baseB != base10)
        {
            finalFormat = convert(10, baseB, decimalFormat);
        }

        return finalFormat;
    }

    /**
     * Method that converts the number from old base to new base
     *
     * @param oldBase base from which we convert
     * @param newBase base to which we convert
     * @param number number that we convert
     * @return converted number
     */
    private static int convert(int oldBase, int newBase, int number)
    {
        int convertedNumber = 0;
        int multiplier = 1;

        while (number > 0)
        {
            convertedNumber += number % newBase * multiplier;
            number /= newBase;
            multiplier *= oldBase;
        }

        return convertedNumber;
    }
}
