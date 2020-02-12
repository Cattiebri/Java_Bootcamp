package jtm.extra12;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SHA256Cracker {


    /*
        TODO Read about SHA-256 algorithm and multiple ways how to hash strings in Java with SHA-256

        When provided with a SHA-256 hash, return the value that was hashed.
        You are also given the characters that make the expected value, but in alphabetical order.

        The returned value is less than 10 characters long.
        Return null when the hash cannot be cracked with the given characters.

        Example crackSha256("5694d08a2e53ffcae0c3103e5ad6f6076abd960eb1f8a56577040bc1028f702b", "cdeo")
        should output code
     */

    static String crackSha256(String hash, String chars) {
        return null;
    }


    public static void main(String[] args) {
        String result = crackSha256("5694d08a2e53ffcae0c3103e5ad6f6076abd960eb1f8a56577040bc1028f702b", "cdeo");
        System.out.println(result);
    }
}
