package jtm.activity13.a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "world") String name) {
        /* TODO
           Return string value in form Hello <name>!, where <name> is value from name parameter */
        return "Hello " + name + "!";
    }

    /*
        TODO
        Set REST method path to /numbers
     */
    @GetMapping
    public String numbers(Integer from, Integer to) {
        /* TODO
           Add RequestParam annotations to both parameters, set both parameters as non-required,
           set default from value to "1", set default fo value to "20"
           Add String which contains all numbers in from-to range, from value should be included in result
           to should not be included

           Example: if from is 1 and to is 10, response should be 123456789
           Example: if from is 5 and to is 12, response should be 567891011

        */
        return null;
    }


}
