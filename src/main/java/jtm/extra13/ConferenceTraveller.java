package jtm.extra13;

import java.util.Arrays;
import java.util.List;

public class ConferenceTraveller {
    /*
        TODO

        Lucy loves to travel. Luckily she is a renowned computer scientist and gets to travel to international
        conferences using her department's budget.

        Each year, Society for Exciting Computer Science Research (SECSR) organizes several
        conferences around the world. Lucy always picks one conference from that list that
        is hosted in a city she hasn't been to before, and if that leaves her with more than one option,
        she picks the conference that she thinks would be most relevant for her field of research.

        citiesVisited, a list of cities that Lucy has visited before, given as an array of strings.
        citiesOffered, a list of cities that will host conferences this year, given as an array of strings,
            ordered in terms of the relevance of the conferences for Lucy's research (from the most to the least relevant).


        Example:
        citiesVisited = ["Mexico City","Johannesburg","Stockholm","Osaka','Saint Petersburg','London'];
        citiesOffered = ["Stockholm","Paris","Melbourne"];
        Correct answer:  'Paris' (City that has not been visited before, and has the highest priority)
     */

    public static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
       return null;
    }

    public static void main(String[] args) {
        String city = conferencePicker(
                new String[]{"Mexico City", "Johannesburg", "Stockholm", "Osaka", "Saint Petersburg", "London"},
                new String[]{"Stockholm", "Paris", "Melbourne"}
        );
        System.out.println(city);
    }

}
