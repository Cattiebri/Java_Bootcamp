package jtm.extra03;

import jtm.activity03.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticalNumbers {
    // TODO Read article https://en.wikipedia.org/wiki/Practical_number
    // Implement method, which returns practical numbers in given range
    // including

    public String getPracticalNumbers(int from, int to) {

        String answer = "[";
        int[] numbers = fillArray(from, to);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            List<Integer> divisors = findDivisors(numbers[i]);
            boolean isPractical = true;
            for (int k = 1; k < numbers[i]; k++) {
                boolean sumPossible = sum_up(divisors, k);
                if (!sumPossible) {
                    isPractical = false;
                }
            }
            if (isPractical) {
                if (answer.equals("[")) {
                    answer = answer + numbers[i];
                } else {
                    answer = answer + ", " + numbers[i];
                }
            }
        }
        answer = answer + "]";
        return answer;
    }

    private boolean isSumPossible(int sum, List<Integer> numbers) {
        //return true if sum can be expressed from numbers

        return true;
    }

    private boolean sum_up(List<Integer> numbers, int target) {
        if(sum_up_recursive(numbers, target, new ArrayList<Integer>()))
            return true;
        else
            return false;
    }

    private boolean sum_up_recursive(List<Integer> numbers, int target, List<Integer> partial) {
        int s = 0;
        for (int x : partial) s += x;

        if (s == target) {
            System.out.println("sum(" + String.join(",", partial.toString()) + ")=" + target);
            return true;}
       else  if (s >= target)
            return false;

        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> remaining = new ArrayList<Integer>();
            int n = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) remaining.add(numbers.get(j));

            List<Integer> partial_rec = new ArrayList<Integer>(partial);
            partial_rec.add(n);
            sum_up_recursive(remaining, target, partial_rec);
            return false;
        }
        return false;
    }


    private int[] fillArray(int from, int to) {
        int size = to - from;
        int[] numbers = new int[size];
        int start = from;
        for (int i = 0; i < size; i++) {
            numbers[i] = start;
            start++;
        }
        return numbers;
    }

    private List<Integer> findDivisors(int number) {
        ArrayList<Integer> divisorList = new ArrayList<>();

        int[] test = fillArray(1, number);
        for (int i = 0; i < test.length; i++) {
            if (number % (i + 1) == 0) {
                divisorList.add(test[i]);
            }
        }
        return divisorList;
    }
}
