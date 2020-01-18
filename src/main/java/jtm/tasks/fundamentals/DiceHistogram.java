package jtm.tasks.fundamentals;

public class DiceHistogram {


    /*
        TODO
        A 6-sided die is rolled a number of times and the results are plotted as a character-based histogram.

        You will be passed the dice value frequencies, and your task is to write the code to return a string
        representing a histogram, so that when it is printed it has the same format as the example.


        There are no trailing spaces on the lines
        All lines (including the last) end with a newline \n
        A count is displayed beside each bar except where the count is 0
        The number of rolls may vary but there are never more than 100

        Example:
        [7,3,10,1,0,5] =>

        6|##### 5
        5|
        4|# 1
        3|########## 10
        2|### 3
        1|####### 7
     */
    public static String histogram(final int results[]) {
        String lineIndex = "";
        String hash = "#";
        String end = "";
        String answer = "";

        for(int i = results.length; i >0 ; i--){
            lineIndex = "" +i + "|";
            hash = "";
            for(int j = 0; j<results[i-1]; j++){
                hash = hash + "#";
            }
            if(!(results[i-1]==0)){
                end = " " + results[i-1] + "\n";
            } else {
                end = "\n";
            }
             answer   = answer + lineIndex + hash + end;
        }
        return answer;
    }

}
