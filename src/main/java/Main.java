public class Main
{
    public static void main(String[] args)
    {
        int expectedNumOfArgs = 3;
        if (args.length < expectedNumOfArgs)
        {
            System.out.println("Too few arguments. Three required.");
            return;
        }

        int baseA;
        int baseB;
        int number;

        try
        {
            baseA = Integer.parseInt(args[0]);
            baseB = Integer.parseInt(args[1]);
            number = Integer.parseInt(args[2]);

            final int result = Converter.initConversion(baseA, baseB, number);
            System.out.println(result);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Wrong arguments. Positive integers required.");
        }
        catch (ConversionException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
