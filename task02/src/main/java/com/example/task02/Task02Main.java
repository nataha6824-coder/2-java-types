package com.example.task02;

public class Task02Main {

    public static String solution(String input) {

        long digital = Long.parseLong(input);

        if (digital >= -128 & digital <= 127) {
            return "byte";
        } else if (digital >= (-2L << 14) & digital <= (2L << 14) - 1) {
            return "short";
        } else if (digital >= -(2L << 30) & digital <= (2L << 30) - 1) {
            return "int";
        } else if (digital >= -2L << 62 & digital <= (2L << 62) - 1) {
            return "long";
        }
        return "";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
