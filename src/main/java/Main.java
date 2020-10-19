/**
 * Main class of the app.
 */
public class Main
{
    /**
     * Main method of the app, that gets the parameters and calls the converting method.
     * @param args command line parameters - bases and number to convert
     */
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
