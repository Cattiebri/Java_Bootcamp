package jtm.activity10;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PersonRepo {

    private List<Person> personList;

    public PersonRepo() {
        init();
    }

    public void init() {

        try {
            // 1. Read file data.json from resources folder into String
            // 2. Use ObjectMapper to convert String to List of Persons and
            // store in personList field
            //Hint: Correct way how to use ObjectMapper to convert String to List below
            Path path = Paths.get("src/main/resources/data.json");
            List<String> data = Files.readAllLines(path);
            String listString = String.join("\n ", data);
            System.out.println(listString);
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(listString, Person[].class);
            List<Person> personList = Arrays.asList(personArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person oldestPerson() {
        //Find oldest person in personList field and return it
//        Collections.sort(Person., new Comparator<Score>() {
//
//            public int compare(Score o1, Score o2) {
//                // compare two instance of `Score` and return `int` as result.
//                return o2.getScores().get(0).compareTo(o1.getScores().get(0));
//            }
//        });
        return null;
    }

    public Person youngestPerson() {
        //Find youngest person in personList field and return it
        return null;
    }

    public String largestPopulation() {
        //Find country with largest population and return it's name
        return null;
    }


}








/*

Hint:
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(data, Person[].class);
            List<Person> personList = Arrays.asList(personArray);
 */
