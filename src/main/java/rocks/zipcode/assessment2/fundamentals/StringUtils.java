package rocks.zipcode.assessment2.fundamentals;

import java.util.regex.Pattern;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String response = "";
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            response += " ";
        }
        response += stringToBePadded;

        return response;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String response = stringToBePadded;

        for (int i = 0; i< amountOfPadding - stringToBePadded.length(); i++){
            response += " ";
        }

        return response;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = "";
        for(int i = 0; i <numberOfTimeToRepeat; i++){
            repeated += stringToBeRepeated;
        }


        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if(string.matches("[a-zA-Z]+") == false){
            return false;
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(string.matches("[0-9]+") == false){
            return false;
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        if(string.matches("[a-zA-Z]+") == false){
            return false;
        }
        return true;
    }
}
