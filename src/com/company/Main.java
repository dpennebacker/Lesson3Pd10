package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "Hello ";
        String s2 = "It's Me";
        System.out.println(s1 + s2);
        //above I am concatenating
        //Outputting two things in one SOP
        //it can also mean, I am combining into one
        String s3 = s1 + s2;
        int times = 2;
        String firstLine = s3 + " x" + times;
        System.out.println(firstLine);

        //Method 1
        //This calculates the length
        //of a String
        String firstName = "Dan";
        int firstNameLength =
                firstName.length();

        //SOP firstNameLenight and I would get 3

        //next up method to change cases
        //toUpperCase
        //toLowerCase

        firstName.toUpperCase();
        System.out.println(firstName);
        //WTJ I never changed the value
        //
        firstName = firstName.toUpperCase();
        //substring

        String f = "Craig";
        String l = "Barnes";
        String id = "123456";

        String fni = f.substring(0,1).toLowerCase();
        String lni = l.substring(0,1).toLowerCase();

        String last3id = id.substring(id.length()-3);
        String username = fni + lni + last3id;

        System.out.println(username);

    }
}
