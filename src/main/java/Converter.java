public final class Converter
{
    private Converter() {}

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
