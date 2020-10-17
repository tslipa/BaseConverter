public class ConvertBases
{
    public static int initConversion(int baseA, int baseB, int number) throws Exception
    {
        checkData(baseA, baseB, number);

        int decimalFormat = number;
        if (baseA != 10)
        {
            decimalFormat = convert(baseA, 10, number);
        }

        int finalFormat = decimalFormat;
        if (baseB != 10)
        {
            finalFormat = convert(10, baseB, decimalFormat);
        }

        return finalFormat;
    }

    private static void checkData(int baseA, int baseB, int number) throws Exception
    {
        int minBase = 2;
        int maxBase = 10;
        if (baseA < minBase || baseB < minBase || baseA > maxBase || baseB > maxBase)
        {
            throw new Exception("One of the bases is not between 2 and 10.");
        }
        else if (baseA == baseB)
        {
            throw new Exception("The bases are the same.");
        }

        int minNumber = 0;
        if (number < minNumber)
        {
            throw new Exception("The number should be a positive integer.");
        }
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
