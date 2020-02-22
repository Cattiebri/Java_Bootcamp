package jtm.extra16;

import java.util.Arrays;

/*
    Lunar Mathematics, otherwise known as 'Dismal Mathematics' (a play on 'decimal mathematics'),
    was created as an alternate way to view mathematics interacts with numbers.
    Here, we will create the addition function.

    On the moon, there is no need to carry over numbers into the next column.
    Instead, we take the largest value of each column, and set that as our total.

    Example 1:
      8
    + 7
    ----
      8 <- Since 8 is the larger number of the two, it is the one used.

    Example 2:
      234
    + 180
    -----
      284 <- the larger values of each number are used for each potion.

    Example 3:
      465
     + 72
    -----
      475 <- You must handle situations where numbers are not of equal length
 */
public class LunarCalculator {

    public static long add(long number1, long number2) {
        /* The moon people believe in you. */
        String n1string = String.valueOf(number1);
        String[] n1array = n1string.split("(?<=.)");

        String n2string = String.valueOf(number2);
        String[] n2array = n2string.split("(?<=.)");

        String[] answerArray;
        String[] unchangedArray;
        String[] changedArray;

        if (n1array.length > n2array.length) {
            answerArray = new String[n1array.length];
            unchangedArray = new String[n1array.length];
            for (int i = 0; i < n1array.length; i++) {
                unchangedArray[i] = n1array[i];
            }
            changedArray = new String[n1array.length];
            int forZeros = n1array.length - n2array.length;
            int counter = 0;
            for (int k = 0; k < n1array.length; k++) {
                if (k < forZeros) {
                    changedArray[k] = "0";
                } else {
                    changedArray[k] = n2array[counter++];
                }
            }

            System.out.println("Unchanged array: " + Arrays.toString(unchangedArray));
            System.out.println("Changed array: " + Arrays.toString(changedArray));
        } else {
            answerArray = new String[n2array.length];
            unchangedArray = new String[n2array.length];
            for (int i = 0; i < n2array.length; i++) {
                unchangedArray[i] = n2array[i];
            }
            changedArray = new String[n2array.length];
            int forZeros = n2array.length - n1array.length;
            int counter = 0;
            for (int k = 0; k < n2array.length; k++) {
                if (k < forZeros) {
                    changedArray[k] = "0";
                } else {
                    changedArray[k] = n1array[counter++];
                }
            }

            System.out.println("Unchanged array: " + Arrays.toString(unchangedArray));
            System.out.println("Changed array: " + Arrays.toString(changedArray));
        }

        for (int i = 0; i < answerArray.length; i++) {
            if (Integer.parseInt(changedArray[i]) > Integer.parseInt(unchangedArray[i])) {
                answerArray[i] = changedArray[i];
            } else {
                answerArray[i] = unchangedArray[i];
            }
        }
        System.out.println("Array with largest values: " + Arrays.toString(answerArray));

        String answer = "";
        //for (String el : answerArray) {
            answer = String.join("",answerArray);
        //}
        System.out.println(answer);

        long l = Long.parseLong(answer);
        return l;
    }

    public static void main(String[] args) {

        add(465, 72);
        add(9, 245);
    }
}
