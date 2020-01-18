package jtm.tasks.fundamentals;

import java.util.Arrays;

public class EvenNumbers {

    //TODO
        /*
            Complete the function which takes two arguments and returns all numbers which
            are divisible by the given divisor.
            First argument is an array of numbers and the second is the divisor.
            Example:
            divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
         */
    public static int[] divisibleBy(int[] numbers, int divider) {

        int[] collection = new int[numbers.length];

        int newCount = 0;

        for (int i = 0 ; i <numbers.length; i++){
            if(numbers[i] % divider == 0){
                collection[i] = numbers[i];
                newCount++;
            } else {
                collection[i] = -1;
            }
        }
        System.out.println(Arrays.toString(collection));

        int count = 0;
        int temp;
        int newSize = 0;
//
        // Traverse the array. If arr[i] is
        // non-zero, then swap the element at
        // index 'count' with the element at
        // index 'i'
        for (int i = 0; i < collection.length; i++) {
            if ((collection[i] != -1)) {
                temp = collection[count];
                collection[count] = collection[i];
                collection[i] = temp;
                count = count + 1;
                newSize++;
            }

        }
        System.out.println(Arrays.toString(collection));

        int[] shortCol = new int[newSize];
        for(int i = 0; i<newSize; i++){
            shortCol[i] = collection[i];
        }
        System.out.println(Arrays.toString(shortCol));

        return shortCol;
    }
}
