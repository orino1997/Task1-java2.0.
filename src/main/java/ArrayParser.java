/**
 * @author 79304
 */
public class ArrayParser {
    public static void printLongestLine(String... strings) {
        String result = strings[0];
        int maxNumberOfChars = result.length();
        for (String currentLine : strings) {
            if (currentLine.length() > maxNumberOfChars){
                result = currentLine;
                maxNumberOfChars = result.length();
            }
        }
        System.out.println("The longest word is " + result);
    }
}
