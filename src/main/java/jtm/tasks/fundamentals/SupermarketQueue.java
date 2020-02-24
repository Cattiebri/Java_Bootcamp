package jtm.tasks.fundamentals;

import jtm.activity03.Array;

import java.util.Arrays;

public class SupermarketQueue {

    /*
        TODO
        There is a queue for the self-checkout tills at the supermarket.
        Your task is write a function to calculate the total time required for all the customers to check out!

        Input:
            customers: an array of positive integers representing the queue. Each integer represents a customer,
                and its value is the amount of time they require to check out.
            n: a positive integer, the number of checkout tills.
        Output
            The function should return an integer, the total time required.

        Examples:
        queueTime([5,3,4], 1) => should return 12
        Because when there is 1 till, the total time is just the sum of the times

        queueTime([10,2,3,3], 2) => should return 10
        Because here n=2 and the 2nd, 3rd, and 4th people in the queue finish before the 1st person has finished.

        queueTime([2,3,10], 2) => should return 12

     */

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (n == 1) {
            int totalMinutes = 0;
            for (int minutes : customers) {
                totalMinutes += minutes;
            }
            return totalMinutes;
        } else {
           int indexOfSmallestTime = 0;
            int[] minutesInTills = new int[n];
            int minValue = 0;
            for (int i = 0; i < customers.length; i++) {
                minValue = minutesInTills[0];
                for (int j = 0; j < minutesInTills.length; j++) {
                    if (minutesInTills[j] <= minValue) {
                        minValue = minutesInTills[j];
                        indexOfSmallestTime = j;
                    }
                }
                minutesInTills[indexOfSmallestTime] = minutesInTills[indexOfSmallestTime] + customers[i];
            }
            int maxValue = minutesInTills[0];
            for (int i = 0; i < minutesInTills.length; i++) {
                if (minutesInTills[i] > maxValue) {
                    maxValue = minutesInTills[i];
                }
            }
            return maxValue;
        }
    }
}
