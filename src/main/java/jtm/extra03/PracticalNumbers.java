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
        ArrayList<Integer> divisorList = new ArrayList<>();

        int[] test = fillArray(1, number);
        for (int i = 0; i < test.length; i++) {
            if (number % (i+1) == 0) {
                divisorList.add(test[i]);
            }
            else {
                break;
            }
        }
        boolean status = false;
        int sum = divisorList.get(0);
        for (int i = 1; i < divisorList.size() - 1; i++) {
            if (sum < divisorList.get(i) - 1) {
                status = false;
                break;
            } else {
                status = true;
                sum += divisorList.get(i);
            }

        }
        return status;
//        check(divisorList,number);
//    }

//    boolean status = false;
//
//    //        for (int j = 0; j < divisorList.size(); j++) {
////            if (sum < divisorList.get(j)) {
////                status = false;
////                return status;
////            } else {
////                status = true;
////                sum += divisorList.get(j);
////            }
////        }
//    private void check(ArrayList<Integer> arr, int number){
//    int []ispossible = new int[number];
//
//        for (int i = 0; i < number; ++i) {
//            int val = arr.get(i);
//
//            // if it is already possible
//            if (ispossible[val] == arr.get(i)) {
//                continue;
//            }
//
////            // make 1 to all it's next elements
////            for (int j = 0; j + val < 1000; ++j)
////                if (ispossible[j] == 1)
////                    ispossible[j + val] = 1;
//        }
//        return
//    }
    }
}
