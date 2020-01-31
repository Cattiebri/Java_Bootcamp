package jtm.extra03;

import jtm.activity03.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticalNumbers {
    // TODO Read article https://en.wikipedia.org/wiki/Practical_number
    // Implement method, which returns practical numbers in given range
    // including
    public String getPracticalNumbers(int from, int to) {

        String answer = "[";
        int[] numbers = fillArray(from, to);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (findDivisors(numbers[i])) {
                if(answer.equals("[")){
                    answer = answer + numbers[i];
                } else {
                    answer = answer + ", " + numbers[i];
                }
            }
        }
        answer = answer + "]";
        return answer;
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

    private boolean findDivisors(int number) {
        ArrayList<Integer> myList = new ArrayList<>();

        ArrayList<Integer> falseList = new ArrayList<>();
        int[] test = fillArray(1, number);
        for (int i = 1; i < test.length; i++) {
            if (number % i == 0) {
                myList.add(i);
            } else {
                falseList.add(i);
            }
        }
        int sum = myList.get(0);
        boolean status = false;
//        for (int i = 0; i < myList.size(); i++) {
            for (int j = 1; j < myList.size() - 1; j++) {
                if (sum < myList.get(j) - 1) {
                    status = false;
                    break;
                } else {
                    status = true;
                    sum += myList.get(j);
                }
            }
//            if (status && sum == myList.get(i)) {
//                status = true;
//                return status;
//            } else {
//                return false;
//            }
//        }
    return status;
    }
}