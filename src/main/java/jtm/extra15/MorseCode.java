package jtm.extra15;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MorseCode {

    /*
        TODO

        Implement function that translates given text to morse code
        Morse code encodings can be found in MorseLetters.txt
        Add one empty space after each morse letter so that it would be
            easier to see where one ends and the next one starts
        Replace empty spaces with straight line symbol: |

        Example:
            Thank you very much
            - .... .- -. -.- | -.-- --- ..- | ...- . .-. -.-- | -- ..- -.-. ....

            Note that morse code does not have capitalization e.g. T and t are both the same in morse code: '-'

     */
    public static String translateToMorse(String text) {
        return null;
    }

    public static void main(String[] args) {
        String expected = "- .... .- -. -.- | -.-- --- ..- | ...- . .-. -.-- | -- ..- -.-. ....";
        String result = translateToMorse("Thank you very much");

        System.out.println("'" + expected + "'");
        System.out.println("'" + result + "'");
    }
}
