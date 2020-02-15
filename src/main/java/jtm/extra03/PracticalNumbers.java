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
                boolean sumPossible = isSumPossible(k, divisors, new ArrayList<Integer>());
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

    private boolean isSumPossible(int sum, List<Integer> numbers, ArrayList<Integer> testList) {
        //return true if sum can be expressed from numbers
        boolean check = false;
        int result = 0;
        for (int x : testList) {
            result += x;
            if (result == sum) {
                System.out.println("sum(" + Arrays.toString(testList.toArray()) + ")=" + sum);
                check = true;
            } else if (result > sum) {
                check = false;
            } else {
                for (int i = 0; i < numbers.size(); i++) {
                    ArrayList<Integer> remaining = new ArrayList<>();
                    int n = numbers.get(i);
                    for (int j = i + 1; j < numbers.size(); j++) remaining.add(numbers.get(j));
                    ArrayList<Integer> partial_rec = new ArrayList<>(testList);
                    partial_rec.add(n);
                    isSumPossible(sum, remaining, partial_rec);
                    check = true;
                }
            }
        }
        return check;
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
