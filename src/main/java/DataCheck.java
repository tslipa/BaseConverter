public class DataCheck
{
    public static void initCheck(int baseA, int baseB, int number) throws Exception
    {
        checkBases(baseA, baseB);
        checkNumber(number);
    }

    private static void checkBases(int baseA, int baseB) throws Exception
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
    }

    private static void checkNumber(int number) throws Exception
    {
        int minNumber = 0;
        if (number < minNumber)
        {
            throw new Exception("The number should be a positive integer.");
        }
    }
}
