package jtm.extra03;

import jtm.activity03.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticalNumbers {
    // TODO Read article https://en.wikipedia.org/wiki/Practical_number
    // Implement method, which returns practical numbers in given range
    // including
    public String getPracticalNumbers(int from, int to){;
        String answer = "[";
        int[] numbers = fillArray(from, to);
		System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
        	if (findDivisors(numbers[i])) {
				answer = answer + numbers[i];
				if (!(i + 1 == numbers.length)) {
					answer = answer + ", ";
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
        for (int i = 0; i < test.length; i++) {
            if (number % i == 0) {
				myList.add(i);
            } else {
            	falseList.add(i);
			}
        }
	return true;
    }
}