package com.company;

// pulled from David Gassner's Java essential 2019 repo

// here we will be comparing string types and using methods like .equals that works better with comparisons.

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        if (s3 == s4) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        if (s3.equals(s4)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        var s5 = "HELLO!";
        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        try {
            var s6 = s5.substring(2,4);
            System.out.println(s6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
