package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        int reverse = 0;

        while (value > 0) {
            reverse = reverse * 10 + (value % 10);
            value = value / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
