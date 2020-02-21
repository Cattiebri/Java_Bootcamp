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
        return -1;
    }

    public static void main(String[] args) {
        add(465, 72);
    }
}
