package jtm.tasks.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLeaders {

    /*
        TODO
        Given an array/list [] of integers , Find all the LEADERS in the array.
        An element is leader if it is greater than The Sum all the elements to its right side.

        Array size is at least 3 .
        Array numbers Will be mixture of positives , negatives and zeros
        Repetition of numbers in the array could occur.
        Returned Array should store the leading numbers in the same order in the original array.
     */
    public static int[] arrayLeaders(int[] numbers) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            int afterSize = size - i - 1;
            int[] after = new int[afterSize];
            for (int k = 0; k < afterSize; k++) {
                after[k] = numbers[i + 1 + k];
            }
            if (numbers[i] > sum(after)) {
                answer.add(numbers[i]);
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i).intValue();
        }
        return result;
    }

    public static int sum(int[] array) {
        int answer = 0;
        for (int number : array) {
            answer += number;
        }
        return answer;
    }
}
