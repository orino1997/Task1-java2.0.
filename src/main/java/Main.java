import java.util.Scanner;

/**
 * @author 79304
 * Main method prints instructions to console and scans two decimals and the math operation name
 */
public class Main {
    public static void main(String[] args) {
        //scanner initialization
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type '1' for calculations or '2' for getting the longest word from array");
        int activity = Integer.parseInt(scanner.nextLine());

        if (activity == 1) {
            calculatingActivity();
        } else if (activity == 2) {
            arrayActivity();
        } else {
            System.out.println("Wrong operation id");
        }
        scanner.close();
    }

    /**
     * Parses a decimal as an array size, lets a user insert a certain number of words, prints the longest word.
     */
    public static void arrayActivity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number for your array size");
        int arraySize = Integer.parseInt(scanner.nextLine());

        System.out.println("Type the words for the array");
        String[] arrayFromInput = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayFromInput[i] = scanner.nextLine();
        }
        ArrayParser.printLongestLine(arrayFromInput);
        scanner.close();
    }

    /**
     * Parses 2 decimals and operation name from input. If a user mistype operation prints message.
     */
    public static void calculatingActivity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first decimal");
        double firstDecimal = Double.parseDouble(scanner.nextLine());

        System.out.println("Type your second decimal");
        double secondDecimal = Double.parseDouble(scanner.nextLine());
        System.out.println("Type a mathematical operation you want to perform");
        String mathOperation = scanner.nextLine();
        scanner.close();

        double result = 0.0;
        switch (mathOperation) {
            case "addition":
                result = Calc.addition(firstDecimal, secondDecimal);
                break;
            case "subtraction":
                result = Calc.subtraction(firstDecimal, secondDecimal);
                break;
            case "division":
                result = Calc.division(firstDecimal, secondDecimal);
                break;
            case "multiplication":
                result = Calc.multiplication(firstDecimal, secondDecimal);
                break;
            default:
                System.out.println("Result gets its default value because of wrong operation command");
                break;
        }
        Calc.resultProcessing(result);
    }
}
