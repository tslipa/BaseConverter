public class Main
{
    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("Too few arguments. Three required.");
            return;
        }

        int baseA, baseB, number;
        try
        {
            baseA = Integer.parseInt(args[0]);
            baseB = Integer.parseInt(args[1]);
            number = Integer.parseInt(args[2]);

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

            int result = ConvFromDec.convert(baseB, ConvToDec.convert(baseA, number));
            System.out.println(result);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Wrong arguments. Positive integers required.");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
