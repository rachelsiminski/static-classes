package com.pluralsight;

public class NameFormatter {
    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String fullName) {
        return fullName;
    }



}
