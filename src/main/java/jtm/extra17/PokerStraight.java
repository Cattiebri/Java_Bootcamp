package jtm.extra17;

import java.util.Collections;
import java.util.List;

/*

Your task is to determine if the cards in the list makes up a straight
(five cards of sequential rank) or not.
The cards will always have values ranging from 2-14, where 14 is the ace.
Be aware that the ace (14) also should count as value 1!
The number of cards will vary, but will never be more than 7 (the board (5) + player hand (2))

 Examples:
    straight: 9-10-11-12-13
    straight: 14-2-3-4-5
    straight: 2-7-8-5-10-9-11
    not straight: 7-8-12-13-14
 */
public class PokerStraight {

    public static boolean isStraight(List<Integer> cards) {

        Collections.sort(cards);

        System.out.println(cards);
        int counter = 0;
        for (int i = 0; i < cards.size(); i++) {

            if ((cards.get(cards.size() - 1) == 14) && counter == 0) {
                counter = 1;
            }
            if (!(i + 1 == cards.size())) {
                if (((cards.get(i) + 1) == cards.get(i + 1)) || ((cards.get(i) == 5 && (cards.get(i+1) == 14)))) {
                    counter++;
                    if (counter >= 5) {
                        return true;
                    }
                }
            } else {
                if ((cards.get(i) == cards.get(i - 1) + 1)) {
                    counter++;
                    if (counter >= 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
