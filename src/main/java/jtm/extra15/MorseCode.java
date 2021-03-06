package jtm.extra15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
    public static String translateToMorse(String text) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/main/java/jtm/extra15/MorseLetters.txt"));
        String str;

        List<String> list = new ArrayList<>();
        while ((str = in.readLine()) != null) {
            list.add(str);
        }

        String[] morseArray = list.toArray(new String[0]);

        int textLength = text.length();
        String textToUse = text.toLowerCase();
        String[] textArray = textToUse.split("(?!^)");
        String answer = "";

        for (int k = 0; k < textLength; k++) {
            for (int i = 0; i < morseArray.length; i++) {
                if (morseArray[i].contains(textArray[k])) {
                    if (!(textArray[k].equals(" "))) {
                        if(k+1==textLength){
                            answer = answer + morseArray[i].substring(2);
                        } else {
                            answer = answer + morseArray[i].substring(2) + " ";
                        }
                    } else {
                        answer = answer + "| ";
                    }
                }
            }
        }
            System.out.println(Arrays.toString(textArray));

            return answer;
        }

        public static void main (String[]args) throws IOException {
            String expected = "- .... .- -. -.- | -.-- --- ..- | ...- . .-. -.-- | -- ..- -.-. ....";
            String result = translateToMorse("Thank you very much");

            System.out.println("'" + expected + "'");
            System.out.println("'" + result + "'");
        }
    }
