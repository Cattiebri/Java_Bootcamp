package jtm.activity10;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import jtm.activity09.Order;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PersonRepo implements Comparator<Person> {

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
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(listString, Person[].class);
            this.personList = Arrays.asList(personArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person oldestPerson() {
        //Find oldest person in personList field and return it
        Person oldest = personList.get(0);
        for (int i = 0; i < personList.size() - 1; i++) {
            if (compare(oldest, personList.get(i + 1)) >= 0) {
                oldest = personList.get(i + 1);
            }
        }
        return oldest;
    }

    public Person youngestPerson() {
        //Find youngest person in personList field and return it
        Person youngest = personList.get(0);
        for (int i = 0; i < personList.size() - 1; i++) {
            if (compare(youngest, personList.get(i + 1)) <= 0) {
                youngest = personList.get(i + 1);
            }
        }
        return youngest;
    }

    public String largestPopulation() {
        //Find country with largest population and return it's name
        Map<String, Integer> country = new HashMap<>();
        int temp = 0;
        String middle = "";
        for (int i = 0; i < personList.size(); i++) {
            temp = 0;
            middle = personList.get(i).getCountry();
            if (country.containsKey(middle)) {
                temp = country.get(middle);
                country.replace(middle, ++temp);
            } else {
                country.put(personList.get(i).getCountry(), 1);
            }
        }
        return Collections.max(country.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    @Override
    public int compare(Person person, Person t1) {
        return person.getBirthDate().compareTo(t1.getBirthDate());
    }
}








/*

Hint:
            ObjectMapper mapper = new ObjectMapper();
            Person[] personArray = mapper.readValue(data, Person[].class);
            List<Person> personList = Arrays.asList(personArray);
 */
